package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_327 {
    private final Production26_327 production = new Production26_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}