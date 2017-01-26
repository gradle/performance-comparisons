package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_336 {
    private final Production25_336 production = new Production25_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}