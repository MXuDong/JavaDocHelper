package com.mxudong.dochelper.view;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;

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
    private JEditorPane showPage;


    public ShowDocHelperView(ToolWindow toolWindow, Project project) {

        showPage.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                toolWindow.hide(new Runnable() {
                    @Override
                    public void run() {

                    }
                });

            }
        });

    }

    public JPanel getContent() {
        return basePanel;
    }

    public void changeText(String text){
        showPage.setText(text);
    }
}