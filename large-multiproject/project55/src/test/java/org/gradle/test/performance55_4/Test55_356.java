package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_356 {
    private final Production55_356 production = new Production55_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}