package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_276 {
    private final Production31_276 production = new Production31_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}