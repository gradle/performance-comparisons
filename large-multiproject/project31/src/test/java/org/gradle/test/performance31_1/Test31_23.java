package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_23 {
    private final Production31_23 production = new Production31_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}