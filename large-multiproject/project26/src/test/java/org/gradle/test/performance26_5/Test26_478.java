package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_478 {
    private final Production26_478 production = new Production26_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}