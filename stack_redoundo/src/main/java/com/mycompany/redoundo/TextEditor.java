/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.redoundo;
import java.util.Stack;

/**
 *
 * @author kaara
 */
public class TextEditor {
    private String text = "";
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();
    
    public void setText(String newText) {
        text = newText;
        undoStack.push(text);
        redoStack.clear(); // Clear redo stack on new text input
    }
    
    public void append(String toAppend) {
        text += toAppend;
        undoStack.push(text);
        redoStack.clear(); // Clear redo stack on text modification
    }
    
    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text);
            text = undoStack.pop();
        } else {
            System.out.println("Nothing to undo!");
        }
    }
    
    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text);
            text = redoStack.pop();
        } else {
            System.out.println("Nothing to redo!");
        }
    }
    
     public String getText() {
        return text;
    }
}
