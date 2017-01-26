package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_192 {
    private final Production98_192 production = new Production98_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}