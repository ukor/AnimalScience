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
 *
 */
public class Fragment321 extends Fragment {
	public Fragment321(){}
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment321, container, false);
			//Defining webView in fragment321.xml 
			WebView content_webView = (WebView) rootView.findViewById(R.id.content_webView);
			//Loading HTML content into webView
			 content_webView.getSettings().setJavaScriptEnabled(true);
			 content_webView.setWebChromeClient(new WebChromeClient());
			content_webView.loadUrl("file:///android_asset/321.html");
			
			return rootView;
}


}
