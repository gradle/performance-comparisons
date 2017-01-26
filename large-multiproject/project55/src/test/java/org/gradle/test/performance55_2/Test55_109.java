package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_109 {
    private final Production55_109 production = new Production55_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}