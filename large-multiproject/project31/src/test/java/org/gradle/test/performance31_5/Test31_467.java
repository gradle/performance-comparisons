package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_467 {
    private final Production31_467 production = new Production31_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}