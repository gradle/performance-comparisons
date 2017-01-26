package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_390 {
    private final Production55_390 production = new Production55_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}