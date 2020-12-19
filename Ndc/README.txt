/**
 * README.txt
 * Graficación ITO
 * G. Israel Avendaño Martínez
 * Programa de coordenadas normalizadas de un dispositivo
 * para resolver este problema primero leo las coordenadas desde un archivo de texto 
 * que tiene el formato siguiente
 *          coordenada1, coordenada2
 * y al terminar las coordenadas que desea dibujar siempre siempre debe de terminar 
 * con el token end y puede poner más coordenadas y de igual manera terminar con el token 
 * ejemplo.
 *      "nombre del archivo:"  ejemplo1.txt
 *      "datos dentro del archivo:"
 *              0.5,0.7
 *              0.8,0.5
 *              0.8,0.1
 *              0.2,0.1
 *              0.2,0.5
 *              0.5,0.7
 *              end
 *              0.35,0.1
 *              0.35,0.3
 *              0.5,0.3
 *              0.5,0.1
 *              end
 * 
 * 
 * El nombre del archivo se debe de cambiar en el metodo dibujuar de la clase Ndc por el nombre que se guarden las coordenadas
 * eskape<--
 * Despues de obtener los puntos en el método readFile, esas coordenadas las convierte en puntos que los almacena en un arraylist
 * esto sucede en el metodo getPuntos. 
 * Y por último en el metodo drawImg aqui se encarga de recorrer el arreglo obtenido de getpuntos y se va dibujando lineas 
 * de acuerdo a los puntos obtenidos.
 * 
 * 
 * #Israel Eskape
 */