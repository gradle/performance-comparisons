package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_408 {
    private final Production26_408 production = new Production26_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}