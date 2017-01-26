package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_59 {
    private final Production55_59 production = new Production55_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}