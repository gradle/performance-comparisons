package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_236 {
    private final Production26_236 production = new Production26_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}