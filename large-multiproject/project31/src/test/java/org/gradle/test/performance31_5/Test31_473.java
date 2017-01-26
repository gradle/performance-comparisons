package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_473 {
    private final Production31_473 production = new Production31_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}