package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_398 {
    private final Production98_398 production = new Production98_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}