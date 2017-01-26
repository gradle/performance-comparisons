package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_483 {
    private final Production31_483 production = new Production31_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}