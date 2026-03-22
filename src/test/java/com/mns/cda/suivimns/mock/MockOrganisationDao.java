package com.mns.cda.suivimns.mock;

import com.mns.cda.suivimns.dao.OrganisationDao;
import com.mns.cda.suivimns.model.Organisation;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MockOrganisationDao implements OrganisationDao {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Organisation> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Organisation> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Organisation> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Organisation getOne(Integer integer) {
        return null;
    }

    @Override
    public Organisation getById(Integer integer) {
        return null;
    }

    @Override
    public Organisation getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Organisation> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Organisation> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Organisation> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Organisation> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Organisation> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Organisation> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Organisation, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Organisation> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Organisation> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Organisation> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Organisation> findAll() {
        return List.of();
    }

    @Override
    public List<Organisation> findAllById(Iterable<Integer> integers) {
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
    public void delete(Organisation entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Organisation> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Organisation> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Organisation> findAll(Pageable pageable) {
        return null;
    }
}
