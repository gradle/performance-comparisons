package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_381 {
    private final Production31_381 production = new Production31_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}