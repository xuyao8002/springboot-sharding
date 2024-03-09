package com.xuyao.springboot.service.impl;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuyao.springboot.bean.po.Article;
import com.xuyao.springboot.dao.ArticleMapper;
import com.xuyao.springboot.service.IArticleService;
import org.springframework.stereotype.Service;

import static com.xuyao.springboot.consts.Consts.SHARDING_DATA_SOURCE_NAME;


@Service
@DS(SHARDING_DATA_SOURCE_NAME)
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
