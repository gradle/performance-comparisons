package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_51 {
    private final Production55_51 production = new Production55_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}