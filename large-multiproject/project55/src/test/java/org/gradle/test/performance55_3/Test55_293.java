package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_293 {
    private final Production55_293 production = new Production55_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}