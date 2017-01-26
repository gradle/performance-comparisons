package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_200 {
    private final Production55_200 production = new Production55_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}