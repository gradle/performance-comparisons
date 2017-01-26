package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_310 {
    private final Production55_310 production = new Production55_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}