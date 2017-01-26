package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_199 {
    private final Production98_199 production = new Production98_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}