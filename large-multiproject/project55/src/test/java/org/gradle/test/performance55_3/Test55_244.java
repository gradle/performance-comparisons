package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_244 {
    private final Production55_244 production = new Production55_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}