package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_226 {
    private final Production31_226 production = new Production31_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}