package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_243 {
    private final Production55_243 production = new Production55_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}