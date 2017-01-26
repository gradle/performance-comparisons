package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_428 {
    private final Production26_428 production = new Production26_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}