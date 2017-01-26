package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_107 {
    private final Production55_107 production = new Production55_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}