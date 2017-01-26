package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_217 {
    private final Production98_217 production = new Production98_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}