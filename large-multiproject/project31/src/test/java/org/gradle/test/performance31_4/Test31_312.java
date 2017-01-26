package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_312 {
    private final Production31_312 production = new Production31_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}