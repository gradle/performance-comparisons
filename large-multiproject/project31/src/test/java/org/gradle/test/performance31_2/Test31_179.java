package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_179 {
    private final Production31_179 production = new Production31_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}