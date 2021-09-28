# CodingNomads Data Structures and Algorithms Course

A number of CodingNomads mentors and instructors are working on this course. This is where the basic materials will be collated and processed before being turned into a full course on https://codingnomads.co.

## Project Structure

The outline of the course is given in [outline.md](outline.md).

Each major section is given a top level folder (Intro, Data Structures, Algorithms). Under each section are a number of chapters, one for each major data structure or set of algorithms. Under each chapter folder are the documents for each chapter.

Writing guidelines can be found in [guidelines.md](guidelines.md).

Check-in and other guidelines can be found in this document.

## Check-in guidelines

Each author should follow these steps to author new content:

1. In GitHub, navigate to the folder which will contain the content.
2. Click on "Create New File".
3. Name the file accordingly and add some temporary content.
4. Create a pull request to add the new file to the repo and allow comments. 
 a. While creating the PR, select the **Create a new branch for this commit and start a pull request** option.
 b. Use the name of the file you are creating as the branch name. You can add `-1`, `-2`, etc. to differentiate from any earlier branches.
5. Add a link to the PR in the Google Drive tracking sheet, and post that link to the #data-structures-and-algorithms channel in Slack.

After your new branch and PR have been created, follow these steps to edit it locally:

1. On your machine, navigate to the git folder holding the CodingNomads/data_structures_algorithms content.
2. Execute `git pull --rebase` to get the latest content, including your new branch.
3. Execute `git checkout <branch>`, substituting the branch you created in step 4b above for `<branch>`.
4. In the Google Drive tracking sheet, set the status of the chapter to `In Progress`, and update the start and done dates.
5. Fire up your favorite editor and get writing!

You can check in changes to this branch as you see fit.

When you are ready to merge the branch to master, you'll need a reviewer. If you don't have a reviewer, ask for one in the #data-structures-and-algorithms channel in Slack. Once you have a willing reviewer, follow these steps:

1. Notify them you are ready for review, and get an ETA from them when to expect comments.
2. Notify the #data-structures-and-algorithms channel in Slack.
3. Set the status of the chapter to `In Review` in the Google Drive tracking sheet.
4. When the reviewer indicates commentary is done, respond and revise as necessary.
5. When the reviewer indicates the content is ready, you can merge your branch to master.
6. Remove the branch when the merge is complete.

Mechanisms to enforce this flow are currently TBD.
