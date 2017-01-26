package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_223 {
    private final Production31_223 production = new Production31_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}