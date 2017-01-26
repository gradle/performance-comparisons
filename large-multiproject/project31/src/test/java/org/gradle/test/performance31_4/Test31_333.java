package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_333 {
    private final Production31_333 production = new Production31_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}