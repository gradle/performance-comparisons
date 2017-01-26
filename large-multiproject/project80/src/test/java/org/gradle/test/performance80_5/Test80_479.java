package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_479 {
    private final Production80_479 production = new Production80_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}