package com.example.abir.greendaodatabase;

/**
 * Created by ABIR on 3/12/2018.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import org.greenrobot.greendao.database.Database;

public class MyDevOpenHelper extends DaoMaster.DevOpenHelper {
    public MyDevOpenHelper(Context context, String name) {
        super(context, name);
    }

    public MyDevOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {

        switch (oldVersion) {
            case 1:
            /* v1->v2: all changes made in version 2 come here */
//                db.execSQL("ALTER TABLE "+NoteDao.TABLENAME+" ADD COLUMN 'MY_NEW_C' TEXT;");
            /* break was omitted by purpose. */
        }
        super.onUpgrade(db, oldVersion, newVersion);
    }
}