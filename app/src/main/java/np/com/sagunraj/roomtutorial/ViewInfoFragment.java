package np.com.sagunraj.roomtutorial;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ViewInfoFragment extends Fragment {
    TextView viewData;
    List<Info> datalist = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewuser, null);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewData = view.findViewById(R.id.data);
        datalist = MainActivity.appDatabase.dbObject().readInfo();
        String stringData = "";
        for(int i = 0; i<datalist.size();i++){
            stringData = stringData + datalist.get(i).getId()+"\n"+datalist.get(i).getName()+"\n"+datalist.get(i).getPhone()+"\n\n\n";
        }
        viewData.setText(stringData);

    }
}
