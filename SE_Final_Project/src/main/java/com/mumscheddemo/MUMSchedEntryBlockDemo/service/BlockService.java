package com.mumscheddemo.MUMSchedEntryBlockDemo.service;
import com.mumscheddemo.MUMSchedEntryBlockDemo.domain.Block;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface BlockService {

    public void save(Block block);
    public Block getBlockByBlockID(int blockid);
    public Block getBlockByBlockName(String blockName);
    public List<Block> getAllBlock();

    List<Block> listAll();
}


