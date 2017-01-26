package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_138 {
    private final Production55_138 production = new Production55_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}