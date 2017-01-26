package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_117 {
    private final Production26_117 production = new Production26_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}