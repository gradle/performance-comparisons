package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_20 {
    private final Production31_20 production = new Production31_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}