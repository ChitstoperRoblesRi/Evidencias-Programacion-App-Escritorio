const { contextBridge, ipcRenderer } = require('electron');

contextBridge.exposeInMainWorld('api', {
  guardarIMC: (datos) => ipcRenderer.invoke('guardar', datos),
  obtenerHistorial: () => ipcRenderer.invoke('obtener'),
  limpiarHistorial: () => ipcRenderer.invoke('limpiar')
});