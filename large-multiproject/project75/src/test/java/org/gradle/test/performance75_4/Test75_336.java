package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_336 {
    private final Production75_336 production = new Production75_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}