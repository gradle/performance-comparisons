package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_82 {
    private final Production55_82 production = new Production55_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}