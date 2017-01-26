package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_46 {
    private final Production55_46 production = new Production55_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}