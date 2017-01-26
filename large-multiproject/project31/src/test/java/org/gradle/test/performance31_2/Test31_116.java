package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_116 {
    private final Production31_116 production = new Production31_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}