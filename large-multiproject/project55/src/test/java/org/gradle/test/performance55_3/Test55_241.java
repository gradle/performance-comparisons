package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_241 {
    private final Production55_241 production = new Production55_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}