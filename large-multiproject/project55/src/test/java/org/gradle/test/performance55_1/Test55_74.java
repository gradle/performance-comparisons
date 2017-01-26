package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_74 {
    private final Production55_74 production = new Production55_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}