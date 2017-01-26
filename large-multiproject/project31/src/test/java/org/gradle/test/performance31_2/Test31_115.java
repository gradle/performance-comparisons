package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_115 {
    private final Production31_115 production = new Production31_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}