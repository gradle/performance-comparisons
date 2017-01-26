package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_186 {
    private final Production98_186 production = new Production98_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}