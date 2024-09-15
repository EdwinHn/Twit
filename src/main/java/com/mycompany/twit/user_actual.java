
package com.mycompany.twit;


public class user_actual {
    private static UsuarioInfo usuarioActual;  // Variable global para el usuario actual

    public static UsuarioInfo getUsuarioActual() {
    return usuarioActual;
}

    public static void setUsuarioActual(UsuarioInfo usuario) {
        usuarioActual = usuario;
    }
}
