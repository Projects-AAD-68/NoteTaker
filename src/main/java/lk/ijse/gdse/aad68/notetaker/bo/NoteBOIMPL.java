package lk.ijse.gdse.aad68.notetaker.bo;

import lk.ijse.gdse.aad68.notetaker.dto.NoteDTO;

import java.util.List;

public final class NoteBOIMPL implements NoteBo {
    @Override
    public String saveData(NoteDTO noteDTO) {
        return "";
    }

    @Override
    public boolean updateNote(String noteId, NoteDTO noteDTO) {
        return false;
    }

    @Override
    public boolean deleteNote(String noteId) {
        return false;
    }

    @Override
    public NoteDTO getSelectedNote(String noteId) {
        return null;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return List.of();
    }
}
