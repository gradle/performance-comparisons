package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_345 {
    private final Production31_345 production = new Production31_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}