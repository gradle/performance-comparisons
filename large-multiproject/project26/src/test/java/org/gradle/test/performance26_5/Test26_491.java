package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_491 {
    private final Production26_491 production = new Production26_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}