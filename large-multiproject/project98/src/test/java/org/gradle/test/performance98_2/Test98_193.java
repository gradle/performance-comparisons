package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_193 {
    private final Production98_193 production = new Production98_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}