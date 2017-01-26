package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_376 {
    private final Production26_376 production = new Production26_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}