package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_143 {
    private final Production98_143 production = new Production98_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}