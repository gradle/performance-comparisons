package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_459 {
    private final Production31_459 production = new Production31_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}