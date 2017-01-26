package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_336 {
    private final Production13_336 production = new Production13_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}