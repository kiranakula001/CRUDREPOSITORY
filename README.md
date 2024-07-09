# CRUDREPOSITORY
used to develop presistence logic in our application--responsible to communicate with dbase.
giving REPOSITORY INTERFACES to perform CRUD OPERATIONS

1) CrudRepository
2) JPAREPOSITORY--for extra querying,sorting use this rather than crud
public interface facebook extends CRUDREPOSITORY<ENITY,ID>{
}
