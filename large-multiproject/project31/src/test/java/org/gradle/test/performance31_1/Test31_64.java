package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_64 {
    private final Production31_64 production = new Production31_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}