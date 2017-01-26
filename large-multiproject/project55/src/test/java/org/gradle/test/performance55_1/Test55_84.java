package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_84 {
    private final Production55_84 production = new Production55_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}