package fr.upmc.dar.sncf.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.upmc.dar.sncf.repository.MessageCustomRepository;

public class MessageRepositoryImpl implements MessageCustomRepository {

	@PersistenceContext
	private EntityManager entityManager;

}
