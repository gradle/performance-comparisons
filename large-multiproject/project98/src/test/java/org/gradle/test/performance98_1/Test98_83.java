package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_83 {
    private final Production98_83 production = new Production98_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}