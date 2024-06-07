package net.developia.boot_article.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.developia.boot_article.dao.ArticleDAO;
import net.developia.boot_article.dto.ArticleDTO;

@RequiredArgsConstructor
@Service
@Log4j2
public class ArticleServiceImpl implements ArticleService {

	private final ArticleDAO articleDAO;

	@Override
	public void insertArticle(ArticleDTO articleDTO) throws Exception {
		try {
			articleDAO.insertArticle(articleDTO);
			log.info("게시물 입력 성공");
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}

	}

	@Override
	public List<ArticleDTO> getArticleList() throws Exception {
		try {
			return articleDAO.getArticleList();
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}
	}

	@Override
	public ArticleDTO getDetail(long no) throws Exception {
		try {
			ArticleDTO articleDTO = articleDAO.getDetail(no);
			if (articleDTO == null) {
				throw new RuntimeException("없는 게시물이거나 접근 권한이 없습니다.");
			}
			return articleDTO;
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}
	}

	@Override
	public void deleteArticle(ArticleDTO articleDTO) throws Exception {
		try {
			if (articleDAO.deleteArticle(articleDTO) == 0) {
				throw new RuntimeException("비밀번호가 일치하지 않습니다.");
			}
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}
	}

	@Override
	public ArticleDTO getArticle(long no) throws Exception {
		try {
			ArticleDTO articleDTO = articleDAO.getDetail(no);
			if (articleDTO == null) {
				throw new RuntimeException("없는 게시물이거나 접근 권한이 없습니다.");
			}
			return articleDTO;
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}
	}

	@Override
	public void updateArticle(ArticleDTO articleDTO) throws Exception {
		try {
			if (articleDAO.updateArticle(articleDTO) == 0) {
				throw new RuntimeException("게시물이 존재하지 않거나 비밀번호가 일치하지 않습니다.");
			}
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}
	}

}