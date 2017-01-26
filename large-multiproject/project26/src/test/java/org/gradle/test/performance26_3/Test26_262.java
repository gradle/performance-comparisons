package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_262 {
    private final Production26_262 production = new Production26_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}