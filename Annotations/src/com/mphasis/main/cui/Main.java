package com.mphasis.main.cui;

import com.mphasis.main.cui.Annotations.DevDetails;
@DevDetails
        (
                author = "John Doe",
                date = "27/05/2021",
                reviewers = {"Alice", "Bob"},
                currentRevision = 8,
                lastModified = "3/6/20",
                lastModifiedBty = "Rahul"
        )
public class Main {
    @DevDetails
            (
                    author = "Tom Doe",
                    date = "27/05/2021",
                    reviewers = {"Alice", "Bob"},
                    currentRevision = 8,
                    lastModified = "3/6/20",
                    lastModifiedBty = "Rahul"
            )

    public static void main(String[] args) {
	// write your code here
    }
}
