package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_306 {
    private final Production55_306 production = new Production55_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}