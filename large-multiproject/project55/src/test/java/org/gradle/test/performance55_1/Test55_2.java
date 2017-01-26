package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_2 {
    private final Production55_2 production = new Production55_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}