package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_499 {
    private final Production98_499 production = new Production98_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}