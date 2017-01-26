package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_336 {
    private final Production84_336 production = new Production84_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}