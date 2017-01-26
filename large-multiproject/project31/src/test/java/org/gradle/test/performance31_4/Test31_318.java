package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_318 {
    private final Production31_318 production = new Production31_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}