package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_226 {
    private final Production55_226 production = new Production55_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}