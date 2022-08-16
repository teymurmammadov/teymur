import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity  {

    Button btn;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn =  findViewById(R.id.idbtn);
 }
    public void btnClick(View v){
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);

        sharingIntent.setType("text/plain");

        sharingIntent.putExtra(Intent.EXTRA_TEXT,"This is the best App for Learning Android"+"\n"+ "https://play.google.com/store/apps/details?id=arjuntoshniwal.androidtutorials.advanced&hl=en");

        sharingIntent.setPackage("com.whatsapp");
        startActivity(sharingIntent);
    }
}