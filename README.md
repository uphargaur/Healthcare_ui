# Project Name

Figma UI Implementation in XML

![Progress](https://img.shields.io/badge/progress-70%25-brightgreen.svg)

## Description

This project involves creating an Android UI layout in XML based on a Figma design.

## Installation

To view and use the Figma UI XML code:

1. Clone this repository to your local machine.
2. Open the Figma design link: [Figma Design](https://www.figma.com/file/PdsuUyoE46FjnqsbTWrOgF/Assignment?node-id=0%3A1&mode=dev)
3. Examine the design elements, including the progress bar, image button, and linear layout.
4. Implement the design in your Android project's layout XML files.

## XML Code

Here's an example XML code for the described UI:

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <!-- Progress Bar -->
    <ProgressBar
        android:id="@+id/progressBar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:max="100"
        android:progress="70" />

    <!-- Image Button -->
    <ImageButton
        android:id="@+id/imageButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:src="@drawable/your_image" />

</LinearLayout>
