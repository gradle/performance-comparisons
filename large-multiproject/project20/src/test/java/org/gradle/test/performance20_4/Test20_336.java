package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_336 {
    private final Production20_336 production = new Production20_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}