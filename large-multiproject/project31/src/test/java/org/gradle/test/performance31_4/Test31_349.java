package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_349 {
    private final Production31_349 production = new Production31_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}