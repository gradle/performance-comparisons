package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_308 {
    private final Production31_308 production = new Production31_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}