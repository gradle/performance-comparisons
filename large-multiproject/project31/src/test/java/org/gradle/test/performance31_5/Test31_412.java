package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_412 {
    private final Production31_412 production = new Production31_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}