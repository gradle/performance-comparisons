package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_443 {
    private final Production31_443 production = new Production31_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}