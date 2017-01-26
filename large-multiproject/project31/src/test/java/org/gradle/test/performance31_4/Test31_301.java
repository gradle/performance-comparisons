package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_301 {
    private final Production31_301 production = new Production31_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}