package org.akboom.blogapi.service;


import org.akboom.blogapi.vo.Result;
import org.akboom.blogapi.vo.param.ArticleParam;
import org.akboom.blogapi.vo.param.PageParam;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ArticleService {

    /**
     * @param pageParam
     * @return Result
     * @Description 分页查询文章列表
     */

    Result getArticleList(PageParam pageParam);

    /**
     * @param
     * @return Result
     * @Description 查询view_counts最多的limit个文章
     */
    Result getHotArticle();

    Result getNewArticle();

    Result getArchives();

    Result getArticle(Long id);

    Result publishArticle(ArticleParam articleParam);

    Result searchArticlesByWord(String search);
}
