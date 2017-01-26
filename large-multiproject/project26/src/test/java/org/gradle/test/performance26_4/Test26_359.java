package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_359 {
    private final Production26_359 production = new Production26_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}