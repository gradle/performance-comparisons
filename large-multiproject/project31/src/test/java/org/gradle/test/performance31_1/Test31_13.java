package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_13 {
    private final Production31_13 production = new Production31_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}