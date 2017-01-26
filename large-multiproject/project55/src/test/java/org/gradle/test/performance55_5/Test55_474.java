package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_474 {
    private final Production55_474 production = new Production55_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}