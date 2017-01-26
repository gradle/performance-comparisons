package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_299 {
    private final Production31_299 production = new Production31_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}