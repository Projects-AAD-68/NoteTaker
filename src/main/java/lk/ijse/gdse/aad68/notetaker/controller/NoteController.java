package lk.ijse.gdse.aad68.notetaker.controller;

import lk.ijse.gdse.aad68.notetaker.dto.NoteDTO;
import lk.ijse.gdse.aad68.notetaker.util.AppUtil;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/notes")
public class NoteController {
   //Todo: CRUD of the note
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createNote(@RequestBody NoteDTO note) {
        //Todo: Handle with BO
        note.setNoteId(AppUtil.createNoteId());
        System.out.println(note);
        return ResponseEntity.ok("Note created successfully");
    }
    @GetMapping(value = "allnotes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<NoteDTO> getAllNotes(){
        System.out.println("Get all notes");
        return null;
    }
    @GetMapping(value = "/{noteId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteDTO getNote(@PathVariable ("noteId") String noteId)  {
        System.out.println(noteId);
        return new NoteDTO(
                "NOTE 4f8a0a67-2ebc-41b2-9de6-4e9bcdba65bb",
                "REST services",
                "Explain the REST",
                "P1",
                "20240818"
        );
    }
    @PatchMapping(value = "/{noteId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateNote(@PathVariable ("noteId") String noteId, @RequestBody NoteDTO note) {
        System.out.println(noteId);
        System.out.println(note+ " Updated");
    }
    @DeleteMapping(value ="/{noteId}" )
    public void deleteNote(@PathVariable ("noteId") String noteId) {
        System.out.println(noteId + " Deleted");
    }
}
