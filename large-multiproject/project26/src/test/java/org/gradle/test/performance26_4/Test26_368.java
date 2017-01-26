package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_368 {
    private final Production26_368 production = new Production26_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}