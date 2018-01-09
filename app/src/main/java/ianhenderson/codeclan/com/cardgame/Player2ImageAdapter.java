package ianhenderson.codeclan.com.cardgame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by ianhenderson on 09/01/2018.
 */



public class Player2ImageAdapter extends BaseAdapter{

    private Context mContext;
    private Game game;

    public Player2ImageAdapter(Context mContext, Game game) {
        this.mContext = mContext;
        this.game = game;
    }


    @Override
    public int getCount() {
        return cardArray().size();
    }

    @Override
    public Object getItem(int i) {
        return cardArray().get(i);
    }

    @Override
    public long getItemId(int i) {
        return cardArray().get(i);
    }


    public ArrayList<Integer> cardArray(){
        ArrayList<Integer> imageIDList = new ArrayList<>();
        Player player1 = this.game.players.get(1);
        ArrayList<Card> playerCards = player1.getHand();
        for (Card card : playerCards){
            int drawableResourceId = mContext.getResources().getIdentifier(card.getImage(), "drawable", mContext.getPackageName());
            imageIDList.add(drawableResourceId);
        }
        return imageIDList;
    }



    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null){
            view = inflater.inflate(R.layout.card_view, viewGroup, false);
            imageView = view.findViewById(R.id.card_view);
        }
        else{
            imageView = (ImageView) view;
        }
        Integer currentCardId = cardArray().get(i);
        imageView.setImageResource(currentCardId);
        return imageView;
    }
}
