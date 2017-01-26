package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_352 {
    private final Production26_352 production = new Production26_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}