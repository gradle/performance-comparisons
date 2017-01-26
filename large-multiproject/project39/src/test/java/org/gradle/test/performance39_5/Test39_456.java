package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_456 {
    private final Production39_456 production = new Production39_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}