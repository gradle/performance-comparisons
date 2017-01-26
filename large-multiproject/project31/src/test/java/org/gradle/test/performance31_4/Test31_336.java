package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_336 {
    private final Production31_336 production = new Production31_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}