package com.qrazhan.twitchdroidtv.presenter;

import android.support.v17.leanback.widget.AbstractDetailsDescriptionPresenter;

import com.qrazhan.twitchdroidtv.model.Stream;

public class DetailsDescriptionPresenter extends AbstractDetailsDescriptionPresenter {
    @Override
    protected void onBindDescription(ViewHolder viewHolder, Object item) {
        Stream movie = (Stream) item;

        if (movie != null) {
            viewHolder.getTitle().setText(movie.getTitle());
            viewHolder.getSubtitle().setText(movie.getStudio());
            viewHolder.getBody().setText(movie.getDescription());
        }
    }
}
