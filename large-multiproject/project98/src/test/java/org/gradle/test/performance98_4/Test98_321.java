package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_321 {
    private final Production98_321 production = new Production98_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}