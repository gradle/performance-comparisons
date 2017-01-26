package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_452 {
    private final Production31_452 production = new Production31_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}