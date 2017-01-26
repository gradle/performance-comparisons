package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_232 {
    private final Production31_232 production = new Production31_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}