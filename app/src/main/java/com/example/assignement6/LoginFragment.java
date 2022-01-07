package com.example.assignement6;

import android.os.Bundle;

import androidx.annotation.NavigationRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.assignement6.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.logIn.setOnClickListener(v -> {

            if (binding.tvPassword.getText().toString().equals("123")) {
                Bundle bundle = new Bundle();
                bundle.putString("userName", binding.tvUserName.getText().toString());

                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment,bundle);

            } else {
                Toast.makeText(getActivity(), "Invalid Password", Toast.LENGTH_SHORT).show();
            }
        });


    }
}