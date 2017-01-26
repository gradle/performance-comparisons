package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_324 {
    private final Production55_324 production = new Production55_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}