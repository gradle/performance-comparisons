package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_242 {
    private final Production98_242 production = new Production98_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}