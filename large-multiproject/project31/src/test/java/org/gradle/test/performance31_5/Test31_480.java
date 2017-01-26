package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_480 {
    private final Production31_480 production = new Production31_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}