
DROP TABLE IF EXISTS rol CASCADE;
CREATE TABLE rol (
                     id_rol INT AUTO_INCREMENT PRIMARY KEY,
                     description VARCHAR(12) NOT NULL
);

DROP TABLE IF EXISTS usuario CASCADE;
CREATE TABLE usuario (
                         id_usuario INT AUTO_INCREMENT PRIMARY KEY ,
                         nombre VARCHAR(255) ,
                         rut VARCHAR(255) ,
                         edad INT ,
                         id_rol INT ,
                         CONSTRAINT usuario_ibfk_1 FOREIGN KEY (id_rol) REFERENCES rol (id_rol)
);
