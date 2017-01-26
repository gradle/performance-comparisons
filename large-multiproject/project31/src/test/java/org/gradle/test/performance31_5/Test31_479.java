package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_479 {
    private final Production31_479 production = new Production31_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}