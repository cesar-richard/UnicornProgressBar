import com.intellij.ide.ui.LafManager;

import javax.swing.UIManager;

public class UnicornApplicationComponent {
    public UnicornApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(__ -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", UnicornProgressBarUi.class.getName());
        UIManager.getDefaults().put(UnicornProgressBarUi.class.getName(), UnicornProgressBarUi.class);
    }
}
