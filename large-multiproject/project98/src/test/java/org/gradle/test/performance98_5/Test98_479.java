package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_479 {
    private final Production98_479 production = new Production98_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}