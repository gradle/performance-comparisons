package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_61 {
    private final Production55_61 production = new Production55_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}