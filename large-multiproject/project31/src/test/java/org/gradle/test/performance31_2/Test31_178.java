package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_178 {
    private final Production31_178 production = new Production31_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}