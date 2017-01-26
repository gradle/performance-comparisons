package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_91 {
    private final Production55_91 production = new Production55_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}