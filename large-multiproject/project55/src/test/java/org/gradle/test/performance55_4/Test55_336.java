package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_336 {
    private final Production55_336 production = new Production55_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}