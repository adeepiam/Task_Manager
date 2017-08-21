package com.example.user.task_manager;



        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


    private EditText etEmail, etPassword;
    private Button btnSignin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnSignin = (Button) findViewById(R.id.btnSignIn);
        btnSignup = (Button) findViewById(R.id.btnSignUp);

        eventHandler();

    }

    private void eventHandler() {
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signInDataHandler();
            }
        });
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),SignUpActivity.class);
                startActivity(i);
            }
        });
    }

    private void signInDataHandler() {
        //// TODO: 14/08/2017 handle sign in by firebase
    }
}
signup:

        package com.example.user.class13noataskmanager;

        import android.support.annotation.NonNull;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.Task;
        import com.google.firebase.auth.AuthResult;
        import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {

    private EditText etEmail, etPassword, etRePassword, etPhone, etName;
    private Button btnSave;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etEmail = (EditText)findViewById(R.id.etEmail);
        etPassword = (EditText)findViewById(R.id.etPassword);
        etRePassword = (EditText)findViewById(R.id.etRePassword);
        etPhone = (EditText)findViewById(R.id.etPhone);
        etName = (EditText)findViewById(R.id.etName);
        btnSave = (Button) findViewById(R.id.btnSave);
        auth = FirebaseAuth.getInstance();
        eventHandler();
    }

    private void eventHandler() {
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveDataHandler();
            }
        });
    }

    private void saveDataHandler() {
        String stEmail = etEmail.getText().toString();
        String stPassword = etPassword.getText().toString();
        String stRePassword = etRePassword.getText().toString();
        String stPhone = etPhone.getText().toString();
        String stName = etName.getText().toString();

        boolean isOk = true;

        if (stEmail.length() < 6 || stEmail.indexOf('@') < 1)//can add more tests
        {
            etEmail.setError("Wrong Email!");
            isOk = false;
        }
        if (stName.length() < 1)
        {
            etName.setError("Name can't be empty");
            isOk = false;
        }
        //// TODO: 14/08/2017 complete checks

        if (isOk)
        {
            auth.createUserWithEmailAndPassword(stEmail, stPassword).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful())
                        //// TODO: 14/08/2017 add new user to MyUsers database
                        finish();//close sign up activity, sign in activity will be displayed
                    else
                        Toast.makeText(SignUpActivity.this,
                                task.getException().getMessage(), //the error message
                                Toast.LENGTH_LONG).show();
                }
            });
        }
        else
        {

        }
    }
}