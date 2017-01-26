package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_192 {
    private final Production31_192 production = new Production31_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}