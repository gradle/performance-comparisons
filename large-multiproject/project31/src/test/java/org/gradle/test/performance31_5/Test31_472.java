package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_472 {
    private final Production31_472 production = new Production31_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}