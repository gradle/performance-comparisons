package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_375 {
    private final Production31_375 production = new Production31_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}