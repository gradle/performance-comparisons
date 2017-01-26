package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_270 {
    private final Production55_270 production = new Production55_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}