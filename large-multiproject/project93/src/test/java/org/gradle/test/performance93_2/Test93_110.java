package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_110 {
    private final Production93_110 production = new Production93_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}