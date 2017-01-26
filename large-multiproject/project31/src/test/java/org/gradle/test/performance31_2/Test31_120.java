package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_120 {
    private final Production31_120 production = new Production31_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}