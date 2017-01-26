package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_10 {
    private final Production55_10 production = new Production55_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}