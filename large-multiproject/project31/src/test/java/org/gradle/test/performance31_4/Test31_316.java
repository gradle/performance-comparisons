package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_316 {
    private final Production31_316 production = new Production31_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}