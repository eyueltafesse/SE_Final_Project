package com.mumscheddemo.MUMSchedEntryBlockDemo.service;
import com.mumscheddemo.MUMSchedEntryBlockDemo.Repository.BlockRepository;
import com.mumscheddemo.MUMSchedEntryBlockDemo.domain.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BlockService {

        @Autowired
        private BlockRepository repo;

        public List<Block> listAll() {
            return repo.findAll();
        }

        public void save(Block block) {
            repo.save(block);
        }

        public Block get(Integer id) {
            return repo.findById(id).get();
        }

        public void delete(Integer id) {
            repo.deleteById(id);
        }
    }


