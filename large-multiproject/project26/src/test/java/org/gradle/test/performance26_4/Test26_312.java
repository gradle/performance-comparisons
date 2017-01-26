package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_312 {
    private final Production26_312 production = new Production26_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}