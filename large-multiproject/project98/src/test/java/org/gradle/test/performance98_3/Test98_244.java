package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_244 {
    private final Production98_244 production = new Production98_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}