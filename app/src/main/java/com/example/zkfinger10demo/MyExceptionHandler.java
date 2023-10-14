package com.example.zkfinger10demo;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyExceptionHandler implements Thread.UncaughtExceptionHandler {
    private Context context;

    public MyExceptionHandler(Context context) {
        this.context = context;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        // Maneja la excepción aquí, por ejemplo, puedes registrarla en un archivo de registro o enviarla a un servicio de registro de errores.
        Log.e("MyExceptionHandler", "Excepción no detectada", ex);

        // Reinicia la aplicación o realiza alguna otra acción según tus necesidades.
        // Por ejemplo, puedes reiniciar la actividad principal de la aplicación.
        Intent intent = new Intent(context, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

        // Finaliza el proceso actual para salir de la aplicación.
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(10);
    }
}
