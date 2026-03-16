const fs = require('fs');
const path = require('path');

const archivo = path.join(__dirname, 'datos.json');

function leer() {
  try {
    const contenido = fs.readFileSync(archivo, 'utf8');
    return JSON.parse(contenido);
  } catch {
    return [];
  }
}

function guardar(datos) {
  const registros = leer();
  datos.fecha = new Date().toLocaleString();
  registros.unshift(datos);
  fs.writeFileSync(archivo, JSON.stringify(registros, null, 2));
  return true;
}

function obtenerTodos() {
  return leer();
}

function limpiar() {
  fs.writeFileSync(archivo, JSON.stringify([]));
  return true;
}

module.exports = { guardar, obtenerTodos, limpiar };