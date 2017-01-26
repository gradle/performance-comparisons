package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_254 {
    private final Production55_254 production = new Production55_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}