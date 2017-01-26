package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_438 {
    private final Production31_438 production = new Production31_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}