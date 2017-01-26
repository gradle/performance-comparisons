package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_50 {
    private final Production26_50 production = new Production26_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}