package com.mxudong.dochelper.view;

import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.EditorTextField;

import javax.swing.*;

/**
 * @author Dong
 * <p>
 * Class Name : ShowDocHelperView
 * Create Time : 15:56
 * Create Date : 2019/3/18
 * Project : Java_Doc Helper
 */

public class ShowDocHelperView {
    private JPanel basePanel;
    private JScrollPane scrollPane;
    private EditorTextField editorTextField;


    public ShowDocHelperView(ToolWindow toolWindow){
        editorTextField.setOneLineMode(false);
        editorTextField.setEnabled(false);
        editorTextField.setText("Test\n<h1>测试</h1>");

    }

    public JPanel getContent(){
        return basePanel;
    }
}
