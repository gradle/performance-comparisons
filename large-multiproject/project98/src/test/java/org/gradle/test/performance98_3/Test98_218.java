package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_218 {
    private final Production98_218 production = new Production98_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}