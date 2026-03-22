package com.mns.cda.suivimns.mock;

import com.mns.cda.suivimns.dao.OrganisationTypeDao;
import com.mns.cda.suivimns.model.OrganisationType;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MockOrganisationTypeDao implements OrganisationTypeDao {
    @Override
    public void flush() {

    }

    @Override
    public <S extends OrganisationType> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends OrganisationType> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<OrganisationType> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public OrganisationType getOne(Integer integer) {
        return null;
    }

    @Override
    public OrganisationType getById(Integer integer) {
        return null;
    }

    @Override
    public OrganisationType getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends OrganisationType> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends OrganisationType> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends OrganisationType> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends OrganisationType> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends OrganisationType> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends OrganisationType> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends OrganisationType, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends OrganisationType> S save(S entity) {
        return null;
    }

    @Override
    public <S extends OrganisationType> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<OrganisationType> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<OrganisationType> findAll() {
        return List.of();
    }

    @Override
    public List<OrganisationType> findAllById(Iterable<Integer> integers) {
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
    public void delete(OrganisationType entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends OrganisationType> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<OrganisationType> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<OrganisationType> findAll(Pageable pageable) {
        return null;
    }
}
