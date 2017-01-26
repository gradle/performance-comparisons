package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_67 {
    private final Production55_67 production = new Production55_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}