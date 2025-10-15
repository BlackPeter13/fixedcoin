package org.fixedcoincore.qt;

import android.os.Bundle;
import android.system.ErrnoException;
import android.system.Os;

import org.qtproject.qt5.android.bindings.QtActivity;

import java.io.File;

public class FixedCoinQtActivity extends QtActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        final File fixedcoinDir = new File(getFilesDir().getAbsolutePath() + "/.fixedcoin");
        if (!fixedcoinDir.exists()) {
            fixedcoinDir.mkdir();
        }

        super.onCreate(savedInstanceState);
    }
}
