package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_402 {
    private final Production31_402 production = new Production31_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}