package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_414 {
    private final Production26_414 production = new Production26_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}