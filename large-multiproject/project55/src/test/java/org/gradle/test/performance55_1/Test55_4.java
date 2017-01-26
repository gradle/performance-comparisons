package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_4 {
    private final Production55_4 production = new Production55_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}