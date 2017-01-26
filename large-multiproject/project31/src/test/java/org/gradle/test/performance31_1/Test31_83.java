package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_83 {
    private final Production31_83 production = new Production31_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}