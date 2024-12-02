package example.dao;

import java.util.List;

import example.main.Article;

public interface ArticleDao {
	@param 
   void addArticle(Article article);

   /**
    * Retrieves all articles from the database.
    * 
    * @return A list of all articles.
    */
   List<Article> getAllArticles();

   /**
    * Retrieves a specific article by its ID.
    * 
    * @param id The ID of the article to retrieve.
    * @return The article object, or null if no article is found with the given ID.
    */
   Article getArticleById(int id);

   /**
    * Updates an existing article in the database.
    * 
    * @param article The article object containing updated information.
    */
   void updateArticle(Article article);

   /**
    * Deletes an article from the database by its ID.
    * 
    * @param id The ID of the article to delete.
    */
   void deleteArticle(int id);
}
