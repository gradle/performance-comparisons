package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_336 {
    private final Production48_336 production = new Production48_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}