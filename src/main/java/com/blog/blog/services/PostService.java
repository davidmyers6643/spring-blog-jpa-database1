package com.blog.blog.services;

import com.blog.blog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
	
//	private List<Post> posts = new ArrayList<>();
	private List<Post> posts;
	
	public PostService() {
		posts = new ArrayList<>();
		createStarterPosts();
	}
	
	public Post findOne(long id) {
		return posts.get((int) id - 1);
	}
	
	public List<Post> findAll() {
		return posts;
	}
	
//	public void save(Post post) {
//		post.setId(posts.size() + 1);
//		posts.add(post);
//	}
	public Post save(Post post) {
		post.setId(posts.size() + 1);
		posts.add(post);
		return post;
	}
	
	private void createStarterPosts() {
		posts.add(new Post(1, "My family", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab aliquam corporis dignissimos dolore exercitationem impedit, iure non nulla optio saepe sint soluta tenetur velit vero, voluptatem! Animi dignissimos eveniet incidunt?"));
		posts.add(new Post(2, "My feelings", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab aliquam corporis dignissimos non nulla optio saepe sint soluta tenetur velit vero, voluptatem! Animi dignissimos eveniet incidunt?"));
		posts.add(new Post(3, "My house", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab aliquam corporis dignissimos dolore exercitationem "));
		
	}
	
	
}
