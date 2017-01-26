package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_413 {
    private final Production31_413 production = new Production31_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}