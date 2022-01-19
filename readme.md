# CodingNomads Data Structures and Algorithms Course

A number of CodingNomads mentors and instructors are working on this course. This is where the basic materials will be collated and processed before being turned into a full course on https://codingnomads.co.

## Project Structure

The outline of the course is given in [outline.md](outline.md).

Each major section is given a top level folder (Intro, Data Structures, Algorithms). Under each section are a number of chapters, one for each major data structure or set of algorithms. Under each chapter folder are the documents for each chapter.

Writing guidelines can be found in [guidelines.md](guidelines.md).

Check-in and other guidelines can be found in this document.

## Check-in guidelines

Each author should follow these steps to author new content:

1. Clone this repository to their local machine, ie `git clone git@github.com:CodingNomads/data_structures_algorithms.git`
2. `cd` into the new directory you just cloned on your local machine, ie `cd data_structures_algorithms`
3. Create and checkout a new local branch such as `brandon_hash_tables`, ie `git checkout -b brandon_hash_tables`
4. Edit the appropriate folders and files for your section in your IDE of choice
5. Commit these changes to your local machine - please do not commit and unnecessary files
6. Push these changes to your remote branch, ie `git push origin `brandon_hash_tables`
7. When ready, create a pull request to merge your branch into the main branch

When you are ready to merge the branch to master, you'll need a reviewer. If you don't have a reviewer, ask for one in the #data-structures-and-algorithms channel in Slack. Once you have a willing reviewer, follow these steps:

1. Notify them you are ready for review, and get an ETA from them when to expect comments.
2. Notify the #data-structures-and-algorithms channel in Slack.
3. Set the status of the chapter to `In Review` in the Google Drive [tracking sheet](https://docs.google.com/spreadsheets/d/1RVGPeq4Xpv01AsXPe8NgKdCsKrqURgGhft1EXuztWmQ/edit#gid=0).
4. When the reviewer indicates commentary is done, respond and revise as necessary.
5. When the reviewer indicates the content is ready, the admins will merge your PR.
6. Remove the branch when the merge is complete.

