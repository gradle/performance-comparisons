package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_254 {
    private final Production31_254 production = new Production31_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}