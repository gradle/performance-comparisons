package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_190 {
    private final Production98_190 production = new Production98_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}