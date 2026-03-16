const pesoInput = document.getElementById('peso');
const alturaInput = document.getElementById('altura');
const calcularBtn = document.getElementById('calcular');
const limpiarBtn = document.getElementById('limpiar');
const resultadoDiv = document.getElementById('resultado');
const imcSpan = document.getElementById('imcValor');
const clasificacionSpan = document.getElementById('clasificacion');
const tabla = document.getElementById('tablaHistorial');

function clasificar(imc) {
  if (imc < 18.5) return 'Bajo peso';
  if (imc < 25) return 'Normal';
  if (imc < 30) return 'Sobrepeso';
  return 'Obesidad';
}

async function cargarHistorial() {
  const historial = await window.api.obtenerHistorial();
  tabla.innerHTML = '';
  
  for (let item of historial) {
    const fila = document.createElement('tr');
    fila.innerHTML = `
      <td>${item.fecha}</td>
      <td>${item.peso}</td>
      <td>${item.altura}</td>
      <td>${item.imc.toFixed(2)}</td>
      <td>${item.clasificacion}</td>
    `;
    tabla.appendChild(fila);
  }
}

calcularBtn.addEventListener('click', async () => {
  const peso = parseFloat(pesoInput.value);
  const altura = parseFloat(alturaInput.value);
  
  if (!peso || !altura) {
    alert('Ingresa peso y altura');
    return;
  }
  
  const imc = peso / (altura * altura);
  const clasificacionTexto = clasificar(imc);
  
  imcSpan.textContent = imc.toFixed(2);
  clasificacionSpan.textContent = clasificacionTexto;
  resultadoDiv.style.display = 'block';
  
  await window.api.guardarIMC({
    peso,
    altura,
    imc,
    clasificacion: clasificacionTexto
  });
  
  await cargarHistorial();
  pesoInput.value = '';
  alturaInput.value = '';
});

limpiarBtn.addEventListener('click', async () => {
  if (confirm('¿Limpiar historial?')) {
    await window.api.limpiarHistorial();
    await cargarHistorial();
    resultadoDiv.style.display = 'none';
  }
});

cargarHistorial();