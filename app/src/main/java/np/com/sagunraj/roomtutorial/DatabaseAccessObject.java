package np.com.sagunraj.roomtutorial;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface DatabaseAccessObject {

    @Insert
    public void addInfo(Info info);

    @Query("SELECT * from info")
    public List<Info> readInfo();

    @Update
    public void updateInfo(Info info);

    @Delete
    public void deleteInfo(Info info);

}
