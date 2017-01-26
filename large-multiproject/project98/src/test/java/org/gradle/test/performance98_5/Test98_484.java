package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_484 {
    private final Production98_484 production = new Production98_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}