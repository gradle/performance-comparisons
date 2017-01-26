package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_379 {
    private final Production31_379 production = new Production31_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}