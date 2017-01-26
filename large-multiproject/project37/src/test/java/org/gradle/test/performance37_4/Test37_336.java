package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_336 {
    private final Production37_336 production = new Production37_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}