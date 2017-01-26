package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_429 {
    private final Production31_429 production = new Production31_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}