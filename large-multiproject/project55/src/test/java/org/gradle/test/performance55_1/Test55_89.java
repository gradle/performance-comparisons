package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_89 {
    private final Production55_89 production = new Production55_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}