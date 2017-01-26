package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_429 {
    private final Production26_429 production = new Production26_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}