package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_221 {
    private final Production31_221 production = new Production31_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}