package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_336 {
    private final Production5_336 production = new Production5_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}