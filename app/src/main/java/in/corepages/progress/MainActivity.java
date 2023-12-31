package in.corepages.progress;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;
import in.corepages.progress.databinding.ActivityMainBinding;
// import com.itsaky.androidide.logsender.LogSender;

public class MainActivity extends AppCompatActivity {

	private ActivityMainBinding binding;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		// Remove this line if you don't want AndroidIDE to show this app's logs
		// LogSender.startLogging(this);
        super.onCreate(savedInstanceState);
        // Inflate and get instance of binding
		binding = ActivityMainBinding.inflate(getLayoutInflater());
        // set content view to binding's root
        setContentView(binding.getRoot());
        
        binding.mainWebView.loadUrl("file:///android_asset/index.html");
        
        WebView webView = binding.mainWebView;
        webView.getSettings().setJavaScriptEnabled(true);
        
        
    }
}
