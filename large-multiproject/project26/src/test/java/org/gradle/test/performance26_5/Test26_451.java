package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_451 {
    private final Production26_451 production = new Production26_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}