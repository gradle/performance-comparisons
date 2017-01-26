package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_95 {
    private final Production55_95 production = new Production55_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}