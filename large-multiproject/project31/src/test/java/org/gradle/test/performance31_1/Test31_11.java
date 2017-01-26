package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_11 {
    private final Production31_11 production = new Production31_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}