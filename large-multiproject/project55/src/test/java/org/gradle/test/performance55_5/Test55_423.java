package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_423 {
    private final Production55_423 production = new Production55_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}