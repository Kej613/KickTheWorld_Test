package com.example.kicktheworld_test.Board.Constant;

public enum BoardCategory {
    FREE, TRAVELER_LIST, TRIP_REVIEW, COMMUNITY;

    public static BoardCategory of(String category) {
        if (category.equalsIgnoreCase("free")) return BoardCategory.FREE;
        else if (category.equalsIgnoreCase("traveler_list")) return BoardCategory.TRAVELER_LIST;
        else if (category.equalsIgnoreCase("trip_review")) return BoardCategory.TRIP_REVIEW;
        else if (category.equalsIgnoreCase("community")) return BoardCategory.COMMUNITY;
        else return null;
    }
}
