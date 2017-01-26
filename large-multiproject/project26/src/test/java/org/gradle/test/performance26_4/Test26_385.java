package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_385 {
    private final Production26_385 production = new Production26_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}