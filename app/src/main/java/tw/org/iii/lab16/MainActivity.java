package tw.org.iii.lab16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView)findViewById(R.id.webView);
        initWebView();
    }
    private void initWebView(){
        // 1.
        webView.loadUrl("http://www.iii.org.tw");
        // 2.

    }
}
