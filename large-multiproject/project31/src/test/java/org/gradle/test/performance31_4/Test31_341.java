package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_341 {
    private final Production31_341 production = new Production31_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}