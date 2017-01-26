package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11904 {
    private final Productionnull_11904 production = new Productionnull_11904("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}