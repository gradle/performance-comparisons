package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_66 {
    private final Production55_66 production = new Production55_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}