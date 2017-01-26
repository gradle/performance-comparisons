package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_336 {
    private final Production35_336 production = new Production35_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}