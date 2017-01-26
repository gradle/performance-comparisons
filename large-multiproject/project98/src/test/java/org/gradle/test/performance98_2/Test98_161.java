package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_161 {
    private final Production98_161 production = new Production98_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}