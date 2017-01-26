package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_470 {
    private final Production31_470 production = new Production31_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}