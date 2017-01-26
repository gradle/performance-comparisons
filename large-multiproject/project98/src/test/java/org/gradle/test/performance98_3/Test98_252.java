package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_252 {
    private final Production98_252 production = new Production98_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}