package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_176 {
    private final Production98_176 production = new Production98_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}