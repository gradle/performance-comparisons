package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_158 {
    private final Production98_158 production = new Production98_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}