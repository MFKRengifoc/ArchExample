package com.example.archexample;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {
    private NoteRepository repository;
    private LiveData<List<Note>> allnotes;


    public NoteViewModel(@NonNull Application application) {
        super(application);
        System.err.println("\n\n** NoteViewModelConstructor  **\n\n");
        repository = new NoteRepository(application);
        allnotes = repository.getAllNotes();
    }

    public void insert(Note note){
        repository.insert(note);
    }
    public void update(Note note){
        repository.update(note);
    }
    public void delete(Note note){
        repository.delete(note);
    }
    public void deleteAllNotes(){
        repository.deleteAllNotes();
    }
    public LiveData<List<Note>> getAllnotes(){
        return allnotes;
    }
}