package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_170 {
    private final Production98_170 production = new Production98_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}