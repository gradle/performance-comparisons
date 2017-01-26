package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_336 {
    private final Production80_336 production = new Production80_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}