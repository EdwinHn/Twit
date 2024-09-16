package com.mycompany.twit;

import java.util.ArrayList;
import java.util.Arrays;

class UsuarioInfo {

    private String usuario;
    private String nombre;
    private String edad;
    private String fecha;
    private String contraseña;
    private String genero;
    private boolean cuenta_activada;
    private int seguidores = 0;

    private static UsuarioInfo[] cuentas = new UsuarioInfo[100];
    private static int contador = 0;

    private Seguidores seguidos;

    public UsuarioInfo(String usuario, String nombre, String edad, String fecha, String contraseña, String genero) {
        this.usuario = usuario;
        this.edad = edad;
        this.contraseña = contraseña;
        this.genero = genero;
        this.nombre = nombre;
        this.seguidos = new Seguidores();
        this.cuenta_activada = true;
    }

    public UsuarioInfo() {

    }

    public void desactivarCuenta() {
        cuenta_activada = false;
    }

    public void activarCuenta() {
        cuenta_activada = true;
    }

    public boolean isCuentaActiva() {
        return cuenta_activada;
    }

    public String getusuario() {
        return usuario;
    }

    public String getedad() {
        return edad;
    }

    public String getcontraseña() {
        return contraseña;
    }

    public String getnombre() {
        return nombre;
    }

    public String getgenero() {
        return genero;
    }

    public String getfecha() {
        return fecha;
    }

    public Seguidores getSeguidos() {
        return seguidos;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void incrementarSeguidores() {
        seguidores++;
    }

    public void decrementarSeguidores() {
        if (seguidores > 0) {
            seguidores--;
        }
    }

    public void seguirUsuario(UsuarioInfo usuarioASeguir) {
        if (!this.equals(usuarioASeguir) && !seguidos.loSigo(usuarioASeguir)) {
            seguidos.agregar(usuarioASeguir);
            usuarioASeguir.incrementarSeguidores();
        }

    }

    public void dejarDeSeguir(UsuarioInfo usuarioADejarDeSeguir) {
        if (seguidos.loSigo(usuarioADejarDeSeguir)) {
            seguidos.eliminar(usuarioADejarDeSeguir);
            usuarioADejarDeSeguir.decrementarSeguidores();
        }

    }

    public static UsuarioInfo obtenerUsuarioPerfil(String nombreUsuario) {
        for (int i = 0; i < contador; i++) {
            UsuarioInfo usuario = cuentas[i];
            if (usuario.getusuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    public static UsuarioInfo getCuenta(int index) {
        if (index >= 0 && index < contador) {
            return cuentas[index];
        } else {
            return null;
        }
    }

    public static int getContador() {
        return contador;
    }

    public static void agregarCuenta(UsuarioInfo cuenta) {
        if (contador < cuentas.length) {
            cuentas[contador] = cuenta;
            contador++;
        }
    }

    public static boolean verificar_cuenta(String user) {
        for (int i = 0; i < contador; i++) {
            if (cuentas[i].getusuario().equals(user)) {
                return true;
            }
        }
        return false;
    }

    public static void buscarUsuarios(String texto) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            UsuarioInfo usuario = cuentas[i];
            if (usuario.getusuario().contains(texto) && usuario.isCuentaActiva()) {
                System.out.println(usuario.getusuario());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron usuarios activos.");
        }
    }

    public static String[] buscarUsuariosConSeguimiento(String texto, UsuarioInfo usuarioActual) {
        int contadorResultados = 0;

        String[] resultadosTemp = new String[getContador()];

        for (int i = 0; i < getContador(); i++) {
            UsuarioInfo cuenta = getCuenta(i);

            if (cuenta.getusuario().contains(texto) && cuenta.isCuentaActiva()) {
                String estado = usuarioActual.getSeguidos().loSigo(cuenta) ? "Sigues" : "No sigues";

                resultadosTemp[contadorResultados] = cuenta.getusuario() + " - " + estado;
                contadorResultados++;
            }
        }

        String[] resultados = new String[contadorResultados];
        System.arraycopy(resultadosTemp, 0, resultados, 0, contadorResultados);

        return resultados;
    }

    
}
