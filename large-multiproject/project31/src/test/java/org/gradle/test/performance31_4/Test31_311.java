package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_311 {
    private final Production31_311 production = new Production31_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}