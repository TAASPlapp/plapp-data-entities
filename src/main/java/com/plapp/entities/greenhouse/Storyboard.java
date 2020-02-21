package com.plapp.entities.greenhouse;

import java.util.Date;
import java.util.List;

/*
{
    "id": 1,
    "plant": {
      "description": "Magnificent plant, famous for her passion and glory",
      "id": 134325,
      "owner": 2434,
      "name": "Giorgia",
      "type": "Peony",
      "status": "Healthy",
      "image": "https:/source.unsplash.com/XEmaJaM-4nE/50x50"
    },
    "summary": "The story of my peony named Giorgia",
    "lastModify": "2020-02-14T12:56:00",
    "numLikes": 31,
    "storyboardItems": [
      {
        "id": 9891,
        "image": "https://source.unsplash.com/y-5pd18ETbg/600x800",
        "thumbImage": "https://source.unsplash.com/y-5pd18ETbg/800x300",
        "description": "Working on some desk cleanup... I have had a huge pile of finished and unfinished paintings in the corner. I guess it’s about time to finish this Peony painting I started in 2018! 😂 oops! .\n",
        "title": "Suspiria",
        "status": "Healthy",
        "numLike": 23
      },

    ]
 */
public class Storyboard {
    private long id;
    private String summary;
    private Plant plant;
    private Date lastModified;
    private int numLikes;
    private List<StoryboardItem> storyboardItems;
}
