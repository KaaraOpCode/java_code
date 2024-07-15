/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.redoundo;

/**
 *
 * @author kaara
 */
public class Redoundo {

    public static void main(String[] args) {
       TextEditor editor = new TextEditor();

        editor.setText("Hello, ");
        System.out.println(editor.getText()); // Output: Hello, 

        editor.append("World!");
        System.out.println(editor.getText()); // Output: Hello, World!

        editor.undo();
        System.out.println(editor.getText()); // Output: Hello, 

        editor.redo();
        System.out.println(editor.getText()); // Output: Hello, World!

        editor.append(" How are you?");
        System.out.println(editor.getText()); // Output: Hello, World! How are you?

        editor.undo();
        editor.undo();
        System.out.println(editor.getText()); // Output: Hello, 

        editor.redo();
        System.out.println(editor.getText()); // Output: Hello, World!

        editor.redo();
        editor.redo();  // No more redos after this point
        System.out.println(editor.getText()); // Output: Hello, World! How are you?

        editor.redo();
        System.out.println(editor.getText());    }
}
