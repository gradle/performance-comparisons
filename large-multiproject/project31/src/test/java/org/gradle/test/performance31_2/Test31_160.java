package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_160 {
    private final Production31_160 production = new Production31_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}