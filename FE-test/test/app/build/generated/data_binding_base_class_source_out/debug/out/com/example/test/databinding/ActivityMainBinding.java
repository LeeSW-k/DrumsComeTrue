// Generated by view binder compiler. Do not edit!
package com.example.test.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.test.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout container;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final HorizontalScrollView horizontalScrollView;

  @NonNull
  public final Button metBtn;

  @NonNull
  public final Button recordBtn;

  @NonNull
  public final Button selectMusciBtn;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout container,
      @NonNull FrameLayout frameLayout, @NonNull HorizontalScrollView horizontalScrollView,
      @NonNull Button metBtn, @NonNull Button recordBtn, @NonNull Button selectMusciBtn) {
    this.rootView = rootView;
    this.container = container;
    this.frameLayout = frameLayout;
    this.horizontalScrollView = horizontalScrollView;
    this.metBtn = metBtn;
    this.recordBtn = recordBtn;
    this.selectMusciBtn = selectMusciBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.container;
      LinearLayout container = ViewBindings.findChildViewById(rootView, id);
      if (container == null) {
        break missingId;
      }

      id = R.id.frameLayout;
      FrameLayout frameLayout = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout == null) {
        break missingId;
      }

      id = R.id.horizontalScrollView;
      HorizontalScrollView horizontalScrollView = ViewBindings.findChildViewById(rootView, id);
      if (horizontalScrollView == null) {
        break missingId;
      }

      id = R.id.metBtn;
      Button metBtn = ViewBindings.findChildViewById(rootView, id);
      if (metBtn == null) {
        break missingId;
      }

      id = R.id.recordBtn;
      Button recordBtn = ViewBindings.findChildViewById(rootView, id);
      if (recordBtn == null) {
        break missingId;
      }

      id = R.id.selectMusciBtn;
      Button selectMusciBtn = ViewBindings.findChildViewById(rootView, id);
      if (selectMusciBtn == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, container, frameLayout,
          horizontalScrollView, metBtn, recordBtn, selectMusciBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
