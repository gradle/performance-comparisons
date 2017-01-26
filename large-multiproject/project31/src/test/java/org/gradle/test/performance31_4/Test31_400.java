package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_400 {
    private final Production31_400 production = new Production31_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}