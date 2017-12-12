package com.hiabby.web.interesting.service.Impl;

import com.hiabby.web.interesting.repository.TempRepository;
import com.hiabby.web.interesting.service.InterestingService;
import com.hiabby.web.interesting.utils.CreateTemp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author：Arthas
 * @Created：2017/4/26
 */
@Service("InterestingServiceImpl")
public class InterestingServiceImpl implements InterestingService {
    @Autowired
    private TempRepository tempRepository;

    public int insertTemp(String temp, int row, int num) throws Exception{
        CreateTemp createTemp = new CreateTemp();
        String inputTmpDB = "";
        inputTmpDB = createTemp.createDotmaix(temp, row, num);

        return tempRepository.insertIntoTemp(inputTmpDB,num);
    }
}
