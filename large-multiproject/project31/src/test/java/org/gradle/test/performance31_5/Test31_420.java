package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_420 {
    private final Production31_420 production = new Production31_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}