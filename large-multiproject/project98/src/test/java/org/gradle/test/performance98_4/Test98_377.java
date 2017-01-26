package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_377 {
    private final Production98_377 production = new Production98_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}