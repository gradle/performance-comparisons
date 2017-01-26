package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_292 {
    private final Production26_292 production = new Production26_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}