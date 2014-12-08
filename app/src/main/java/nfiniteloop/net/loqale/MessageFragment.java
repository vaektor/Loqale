package nfiniteloop.net.loqale;

import android.app.ListFragment;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 * no listener, since were just displaying static items
 */
public class MessageFragment extends ListFragment {

    MessageAdapter adapter;
    private List<MessageItem> items;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public MessageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        items = new ArrayList<MessageItem>();

        // TODO: Change Adapter to display your content
        setListAdapter(new MessageAdapter(getActivity(), items));
        
        // will use populate to push items from Main Activity, once I know class name...
    }

    public void populateList() {

    }
}
