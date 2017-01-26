package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_194 {
    private final Production26_194 production = new Production26_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}