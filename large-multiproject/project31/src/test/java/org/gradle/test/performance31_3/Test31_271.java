package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_271 {
    private final Production31_271 production = new Production31_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}