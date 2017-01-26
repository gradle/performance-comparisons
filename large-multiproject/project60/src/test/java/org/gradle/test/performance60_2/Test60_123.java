package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_123 {
    private final Production60_123 production = new Production60_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}