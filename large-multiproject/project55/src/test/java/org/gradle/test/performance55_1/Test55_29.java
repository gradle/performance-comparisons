package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_29 {
    private final Production55_29 production = new Production55_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}