package ewing.faster.common;

import ewing.faster.common.vo.DictionaryNode;
import ewing.faster.common.vo.FindDictionaryParam;
import ewing.faster.dao.entity.Dictionary;
import ewing.query.paging.Page;

import java.util.List;

/**
 * 数据字典服务接口。
 **/
public interface DictionaryService {

    Page<Dictionary> findWithSubDictionary(FindDictionaryParam findDictionaryParam);

    void addDictionary(Dictionary dictionary);

    void updateDictionary(Dictionary dictionary);

    void deleteDictionary(Long dictionaryId);

    List<DictionaryNode> findDictionaryTrees(String[] rootValues);
}
