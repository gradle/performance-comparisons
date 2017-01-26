package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_456 {
    private final Production60_456 production = new Production60_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}