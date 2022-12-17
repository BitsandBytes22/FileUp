# FileUp

This is an application which can help hack simple file handling problems in Windows like mass renaming, folder comparison and syncing, easy editing of metadata, filtering files based on file extension, keeping track of renamed or modified files and data comparison between two files (some of which we are planning to deploy in future updates; detailed later in the document). Operations like mass renaming of files and metadata editing are not that prominent in Windows.



DESCRIPTION OF STACK USED:
1. The GUI and all the functions of the application will be done using java by java libraries.
2. The java sound API – for editing metadata.
3. The Files library – for performing file related functions.



PROBLEMS TACKLED AND BENIFITS:
1. Comparison and syncing of folders is not a function supported in windows yet is an important tool – say we need to sync and compare folder A and folder B, by executing A to B comparison we check for same files in A and B, which of these identical files is up to date and sync A to B(optional). Similar is the case for B to A comparison also.
2. Mass renaming- this is a function that exists in windows but the result of which is not satisfactory. In windows if we go for rename option after selecting several files the format in which they will be renamed is: abc(i) where i is incremented. Here we provide a tool with which we can rename files in the format: abc@@@..xyz##..sty$$$.. where the special characters represent numbers which can be incremented or decremented also the constant string can be eliminated if not necessary. This provides a provision for complex naming.
3. Metadata editing: in windows for editing metadata, we first have to open a file and then look for options to edit metadata. But here we provide a tool with which we can edit metadata by just right clicking.
4. Comparison of file data- implemented in later versions.
5. While working with many files, tools stated above come in handy saving time and effort.
Also, as these functions are attached within an application it also fulfills ease of use.


