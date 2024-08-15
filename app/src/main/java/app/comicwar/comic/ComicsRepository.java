package app.comicwar.comic;

import app.comicwar.utils.Repository;

final class ComicsRepository extends Repository<Comic> {
    private static final ComicsRepository repository;

    static {
        repository = new ComicsRepository();
    }

    public static ComicsRepository getInstance() {
        return repository;
    }
}
