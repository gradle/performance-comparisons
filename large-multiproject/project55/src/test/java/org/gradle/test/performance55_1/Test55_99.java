package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_99 {
    private final Production55_99 production = new Production55_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}