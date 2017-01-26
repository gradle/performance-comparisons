package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_342 {
    private final Production31_342 production = new Production31_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}