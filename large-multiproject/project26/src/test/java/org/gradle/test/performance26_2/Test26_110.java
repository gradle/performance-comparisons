package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_110 {
    private final Production26_110 production = new Production26_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}