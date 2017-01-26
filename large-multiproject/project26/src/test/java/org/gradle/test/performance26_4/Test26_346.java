package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_346 {
    private final Production26_346 production = new Production26_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}