package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_485 {
    private final Production26_485 production = new Production26_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}