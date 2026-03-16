const { app, BrowserWindow, ipcMain } = require('electron');
const path = require('path');
const database = require('./database.js');

let mainWindow;

function createWindow() {
  mainWindow = new BrowserWindow({
    width: 900,
    height: 700,
    webPreferences: {
      preload: path.join(__dirname, 'preload.js')
    }
  });
  mainWindow.loadFile('index.html');
}

app.whenReady().then(() => {
  createWindow();
  
  ipcMain.handle('guardar', async (e, datos) => {
    return await database.guardar(datos);
  });
  
  ipcMain.handle('obtener', async () => {
    return await database.obtenerTodos();
  });
  
  ipcMain.handle('limpiar', async () => {
    return await database.limpiar();
  });
});

app.on('window-all-closed', () => {
  if (process.platform !== 'darwin') app.quit();
});