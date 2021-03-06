/**
 * 
 */
package com.ukorjidechi.animalscience;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * @author Ukor Jidechi E.(2014)
 * The activity loads an html page (312.html)
 * from the asset folder.
 *
 */
public class Fragment312 extends Fragment {
	public Fragment312(){}
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment312, container, false);
			//Defining webView in fragment312.xml 
			WebView content_webView = (WebView) rootView.findViewById(R.id.content_webView);
			//Loading HTML content into webView
			 content_webView.getSettings().setJavaScriptEnabled(true);
			 content_webView.setWebChromeClient(new WebChromeClient());
			content_webView.loadUrl("file:///android_asset/312.html");
			
			return rootView;
}


}
