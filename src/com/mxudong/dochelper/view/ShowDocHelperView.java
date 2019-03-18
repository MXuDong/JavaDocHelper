package com.mxudong.dochelper.view;

import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.EditorTextField;

import javax.swing.*;
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


    public ShowDocHelperView(ToolWindow toolWindow){



    }

    public JPanel getContent(){
        return basePanel;
    }
}
