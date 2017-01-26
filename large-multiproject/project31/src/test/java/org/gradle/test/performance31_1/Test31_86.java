package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_86 {
    private final Production31_86 production = new Production31_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}