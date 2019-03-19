package com.mxudong.dochelper.common;

import com.mxudong.dochelper.view.ShowDocHelperView;

/**
 * @author Dong
 * <p>
 * Class Name : GetSetterManager
 * Create Time : 13:54
 * Create Date : 2019/3/19
 * Project : Java_Doc Helper
 */

public class GetSetterManager {
    private static ShowDocHelperView showDocHelperView;

    public static ShowDocHelperView getShowDocHelperView() {
        return showDocHelperView;
    }

    public static void setShowDocHelperView(ShowDocHelperView showDocHelperView) {
        GetSetterManager.showDocHelperView = showDocHelperView;
    }
}
