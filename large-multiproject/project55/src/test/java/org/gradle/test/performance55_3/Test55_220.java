package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_220 {
    private final Production55_220 production = new Production55_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}