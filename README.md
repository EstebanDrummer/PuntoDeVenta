PuntoDeVenta
============

Prueba de concepto Spring MVC Requiere las siguientes tablas:

CREATE TABLE cliente(
    c_id VARCHAR(10) NOT NULL,
    c_nombre VARCHAR(25),
    c_tipo VARCHAR(20),
    PRIMARY KEY (c_id));

CREATE TABLE tiquete(
    t_id VARCHAR(3) NOT NULL,
    t_cOrigen VARCHAR(25),
    t_cDestino VARCHAR(25),
    t_Fecha VARCHAR(25),
    t_cSillas INT,
    t_Valor INT,
    c_id VARCHAR(10),
    PRIMARY KEY (t_id),
    FOREIGN KEY(c_id) REFERENCES cliente(c_id));
