package com.account.legacy.api.services;

import java.io.IOException;
import java.util.List;

import com.account.legacy.api.documents.*;

public interface AccountService {

	List<Summary> getAll() throws IOException;
}