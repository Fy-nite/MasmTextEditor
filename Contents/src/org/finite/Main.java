package org.finite;
import org.finite.texteditor.TextEditorApp;
import org.Finite.MicrOS.util.*;
public class Main {
    
    public static void main(String[] args) {
        if (!AppLauncher.isRunningInMicrOS()) {
            AppLauncher.launchStandalone(TextEditorApp.class);
        } else {
            System.out.println("This application is designed to run in MicrOS.");
        }
    }
}
