package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_447 {
    private final Production98_447 production = new Production98_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}