package br.com.sweepme.database.SQLite;

import android.database.sqlite.SQLiteDatabase;
import br.com.sweepme.database.DBAdapter;

public class SQLiteAdapter implements DBAdapter {

	private final SQLiteDatabase database;
	private final String databaseFileName = "SweepMe.db";
	
	public SQLiteAdapter() {
		super();
		this.database = SQLiteDatabase.openOrCreateDatabase (databaseFileName, null);
	}

	@Override
	public void executaSQL(String sql) {
		database.execSQL(sql);
	}

}
