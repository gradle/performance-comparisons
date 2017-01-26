package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_11 {
    private final Production26_11 production = new Production26_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}