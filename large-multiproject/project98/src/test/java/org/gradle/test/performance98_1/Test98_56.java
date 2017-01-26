package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_56 {
    private final Production98_56 production = new Production98_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}