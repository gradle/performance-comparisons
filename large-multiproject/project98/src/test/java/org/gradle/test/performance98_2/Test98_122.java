package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_122 {
    private final Production98_122 production = new Production98_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}