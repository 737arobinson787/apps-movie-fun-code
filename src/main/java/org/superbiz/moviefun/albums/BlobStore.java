package org.superbiz.moviefun.albums;

import org.superbiz.moviefun.albums.Blob;

import java.io.IOException;
import java.util.Optional;

public interface BlobStore {

    void put(Blob blob) throws IOException;

    Optional<Blob> get(String name) throws IOException;

    void deleteAll();
}


