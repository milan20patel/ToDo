// Generated by view binder compiler. Do not edit!
package iut.project.mytodolist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import iut.project.mytodolist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContentSettingsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout contentLate;

  @NonNull
  public final ToggleButton darkModeToggle;

  @NonNull
  public final Toolbar toolbar;

  private ContentSettingsBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout contentLate,
      @NonNull ToggleButton darkModeToggle, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.contentLate = contentLate;
    this.darkModeToggle = darkModeToggle;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout contentLate = (LinearLayout) rootView;

      id = R.id.darkModeToggle;
      ToggleButton darkModeToggle = ViewBindings.findChildViewById(rootView, id);
      if (darkModeToggle == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ContentSettingsBinding((LinearLayout) rootView, contentLate, darkModeToggle,
          toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
