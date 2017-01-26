package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_171 {
    private final Production98_171 production = new Production98_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}