package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_335 {
    private final Production31_335 production = new Production31_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}