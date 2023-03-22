package com.masManagement.demo.utils;

public final class UrlConstraint {
	private UrlConstraint() {}
	
	private static final String API = "/api";
	private static final String VERSION = "/v1";
	
	public static class MasManagement{
		public static final String ROOT = API + VERSION + "/members";
		
		public static final String CREATE = "/create";
		public static final String UPDATE = "/update";
		public static final String DELETE = "/{id}";
		public static final String GET = "/{id}";
		public static final String GET_ALL = "/all";
		public static final String GET_SEARCH = "/search";
	}

}
