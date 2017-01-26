package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_470 {
    private final Production26_470 production = new Production26_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}