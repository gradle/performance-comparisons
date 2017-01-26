package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_247 {
    private final Production31_247 production = new Production31_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}