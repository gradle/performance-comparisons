package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_53 {
    private final Production55_53 production = new Production55_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}