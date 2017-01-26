package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_182 {
    private final Production55_182 production = new Production55_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}