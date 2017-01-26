package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_146 {
    private final Production98_146 production = new Production98_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}