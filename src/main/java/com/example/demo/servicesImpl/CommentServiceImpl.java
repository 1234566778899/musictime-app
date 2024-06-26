package com.example.demo.servicesImpl;

import com.example.demo.entities.Comment;
import com.example.demo.repositories.CommentRepository;
import com.example.demo.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getComments(Long id) {
        return commentRepository.getAllComentsByMusical(id);
    }
}
