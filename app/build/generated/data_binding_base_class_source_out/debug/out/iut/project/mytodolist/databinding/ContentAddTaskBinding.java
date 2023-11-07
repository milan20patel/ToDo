// Generated by view binder compiler. Do not edit!
package iut.project.mytodolist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import iut.project.mytodolist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContentAddTaskBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView backButton;

  @NonNull
  public final CheckBox checkboxDate;

  @NonNull
  public final CheckBox checkboxPriority;

  @NonNull
  public final DatePicker tDate;

  @NonNull
  public final EditText tDescription;

  @NonNull
  public final EditText tName;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView toolbarTitle;

  private ContentAddTaskBinding(@NonNull LinearLayout rootView, @NonNull ImageView backButton,
      @NonNull CheckBox checkboxDate, @NonNull CheckBox checkboxPriority, @NonNull DatePicker tDate,
      @NonNull EditText tDescription, @NonNull EditText tName, @NonNull Toolbar toolbar,
      @NonNull TextView toolbarTitle) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.checkboxDate = checkboxDate;
    this.checkboxPriority = checkboxPriority;
    this.tDate = tDate;
    this.tDescription = tDescription;
    this.tName = tName;
    this.toolbar = toolbar;
    this.toolbarTitle = toolbarTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentAddTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentAddTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_add_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentAddTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backButton;
      ImageView backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.checkbox_date;
      CheckBox checkboxDate = ViewBindings.findChildViewById(rootView, id);
      if (checkboxDate == null) {
        break missingId;
      }

      id = R.id.checkbox_priority;
      CheckBox checkboxPriority = ViewBindings.findChildViewById(rootView, id);
      if (checkboxPriority == null) {
        break missingId;
      }

      id = R.id.t_date;
      DatePicker tDate = ViewBindings.findChildViewById(rootView, id);
      if (tDate == null) {
        break missingId;
      }

      id = R.id.t_description;
      EditText tDescription = ViewBindings.findChildViewById(rootView, id);
      if (tDescription == null) {
        break missingId;
      }

      id = R.id.t_name;
      EditText tName = ViewBindings.findChildViewById(rootView, id);
      if (tName == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.toolbarTitle;
      TextView toolbarTitle = ViewBindings.findChildViewById(rootView, id);
      if (toolbarTitle == null) {
        break missingId;
      }

      return new ContentAddTaskBinding((LinearLayout) rootView, backButton, checkboxDate,
          checkboxPriority, tDate, tDescription, tName, toolbar, toolbarTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
