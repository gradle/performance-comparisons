package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_250 {
    private final Production31_250 production = new Production31_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}