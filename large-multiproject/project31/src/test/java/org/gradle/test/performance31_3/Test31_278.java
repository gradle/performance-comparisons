package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_278 {
    private final Production31_278 production = new Production31_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}