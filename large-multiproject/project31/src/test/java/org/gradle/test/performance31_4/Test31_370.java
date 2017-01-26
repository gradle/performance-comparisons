package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_370 {
    private final Production31_370 production = new Production31_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}