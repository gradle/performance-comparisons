package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_410 {
    private final Production31_410 production = new Production31_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}