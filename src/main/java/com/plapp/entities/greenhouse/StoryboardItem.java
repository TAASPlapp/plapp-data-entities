package com.plapp.entities.greenhouse;

/*
{
        "id": 9891,
        "image": "https://source.unsplash.com/y-5pd18ETbg/600x800",
        "thumbImage": "https://source.unsplash.com/y-5pd18ETbg/800x300",
        "description": "Working on some desk cleanup... I have had a huge pile of finished and unfinished paintings in the corner. I guess it’s about time to finish this Peony painting I started in 2018! 😂 oops! .\n",
        "title": "Suspiria",
        "status": "Healthy",
        "numLike": 23
      }
 */
public class StoryboardItem {
    private long id;
    private String image;
    private String thumbImage;
    private String description;
    private String title;
    private Plant.PlantHealthStatus status;
    private int numLikes;
}
