package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_438 {
    private final Production26_438 production = new Production26_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}