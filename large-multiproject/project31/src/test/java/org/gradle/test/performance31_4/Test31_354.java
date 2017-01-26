package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_354 {
    private final Production31_354 production = new Production31_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}