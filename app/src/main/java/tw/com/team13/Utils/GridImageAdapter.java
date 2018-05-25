package tw.com.team13.Utils;

import android.content.Context;
import android.view.LayoutInflater;

import java.util.ArrayList;

/**
 * @author Chun-Kai Kao on 2018/5/26 01:34
 * @github http://github.com/cckaron
 */

public class GridImageAdapter {

    private Context mContext;
    private LayoutInflater mInflater;
    private int layoutResource;
    private String mAppend;
    private ArrayList<String> imgURLs;

    public GridImageAdapter(Context mContext, LayoutInflater mInflater, int layoutResource, String mAppend, ArrayList<String> imgURLs) {
        this.mContext = mContext;
        this.mInflater = mInflater;
        this.layoutResource = layoutResource;
        this.mAppend = mAppend;
        this.imgURLs = imgURLs;
    }
}
