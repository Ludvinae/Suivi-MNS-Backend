package com.mns.cda.suivimns.mock;

import com.mns.cda.suivimns.dao.CommunicationCanalDao;
import com.mns.cda.suivimns.model.CommunicationCanal;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MockCommunicationCanalDao implements CommunicationCanalDao {
    @Override
    public void flush() {

    }

    @Override
    public <S extends CommunicationCanal> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CommunicationCanal> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<CommunicationCanal> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CommunicationCanal getOne(Integer integer) {
        return null;
    }

    @Override
    public CommunicationCanal getById(Integer integer) {
        return null;
    }

    @Override
    public CommunicationCanal getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends CommunicationCanal> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CommunicationCanal> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends CommunicationCanal> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends CommunicationCanal> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CommunicationCanal> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CommunicationCanal> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CommunicationCanal, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends CommunicationCanal> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CommunicationCanal> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<CommunicationCanal> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<CommunicationCanal> findAll() {
        return List.of();
    }

    @Override
    public List<CommunicationCanal> findAllById(Iterable<Integer> integers) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(CommunicationCanal entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends CommunicationCanal> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<CommunicationCanal> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<CommunicationCanal> findAll(Pageable pageable) {
        return null;
    }
}
