package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_22 {
    private final Production31_22 production = new Production31_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}