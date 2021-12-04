package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int signerId;
    private String text;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean inPinned;
    private boolean markerAsAds;
    private Comment comment;
    private CountViews countViews;
    private DateTime dateTime;
    private Emoji emoji;
    private Repost repost;
    private Service service;
}
