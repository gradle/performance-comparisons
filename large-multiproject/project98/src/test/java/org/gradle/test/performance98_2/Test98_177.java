package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_177 {
    private final Production98_177 production = new Production98_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}