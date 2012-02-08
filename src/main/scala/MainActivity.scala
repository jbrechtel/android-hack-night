package org.tw.hacknight

import android.app.Activity
import android.os.Bundle
import android.widget._
import android.view._
import android.content.Intent

class MainActivity extends Activity {
  lazy val rollButton = findViewById(R.id.roll_button).asInstanceOf[Button]

  override def onCreate(bundle: Bundle) {
    super.onCreate(bundle)
    setContentView(R.layout.main)
    rollButton.setOnClickListener( new View.OnClickListener {
      def onClick(view: View) {
        val intent = new Intent(MainActivity.this, classOf[ResultActivity])
        startActivity(intent)
        finish()
      }
    })
  }
}
