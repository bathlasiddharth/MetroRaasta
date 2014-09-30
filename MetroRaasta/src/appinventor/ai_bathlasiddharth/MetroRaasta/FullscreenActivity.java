package appinventor.ai_bathlasiddharth.MetroRaasta;




import android.app.Activity;

import android.os.Bundle;

import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.GeolocationPermissions;
/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class FullscreenActivity extends Activity {
	/**
	 * Whether or not the system UI should be auto-hidden after
	 * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
	 */
	
	/**
	 * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
	 * user interaction before hiding the system UI.
	 */

	/**
	 * If set, will toggle the system UI visibility upon interaction. Otherwise,
	 * will show the system UI visibility upon interaction.
	 */


	/**
	 * The flags to pass to {@link SystemUiHider#getInstance}.
	 */
	

	/**
	 * The instance of the {@link SystemUiHider} for this activity.
	 */


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_fullscreen);

		

		// Set up an instance of SystemUiHider to control the system UI for
		// this activity.
		
				// Set up the user interaction to manually show or hide the system UI.
		
		// Upon interacting with UI controls, delay any scheduled hide()
		// operations to prevent the jarring behavior of controls going away
		// while interacting with the UI.
		
		WebView myWebView = (WebView) findViewById(R.id.webview);
		myWebView.getSettings().setJavaScriptEnabled(true);  
	    myWebView.getSettings().setDomStorageEnabled(true);
	    //myWebView.getSettings().setAppCacheEnabled(true);
	    //myWebView.getSettings().setDatabaseEnabled(true);
	    myWebView.getSettings().setAppCacheEnabled(false);
	    myWebView.setWebViewClient(new WebViewClient());
	    myWebView.getSettings().setAllowFileAccess(true);
	   
	    myWebView.setWebChromeClient(new WebChromeClient() {
	    	public void onGeolocationPermissionsShowPrompt(String origin,
					GeolocationPermissions.Callback callback) {
				// Always grant permission since the app itself requires location
				// permission and the user has therefore already granted it
				callback.invoke(origin, true, false);
			}
	    	});
		myWebView.loadUrl("file:///android_asset/index.html");
		
		
		
	}
	public boolean onKeyDown(int keyCode, KeyEvent event) {  
		WebView myWebView = (WebView) findViewById(R.id.webview);
		   if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()) {  
		     myWebView.goBack();  
		     return true;  
		   }  
		   return super.onKeyDown(keyCode, event);  
		 }  

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);

		// Trigger the initial hide() shortly after the activity has been
		// created, to briefly hint to the user that UI controls
		// are available.
		//delayedHide(100);
	}

	/**
	 * Touch listener to use for in-layout UI controls to delay hiding the
	 * system UI. This is to prevent the jarring behavior of controls going away
	 * while interacting with activity UI.
	 */
	
	

	/**
	 * Schedules a call to hide() in [delay] milliseconds, canceling any
	 * previously scheduled calls.
	 */
	
}
