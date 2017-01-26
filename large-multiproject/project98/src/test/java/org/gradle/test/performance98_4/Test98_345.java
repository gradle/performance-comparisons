package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_345 {
    private final Production98_345 production = new Production98_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}