package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_456 {
    private final Production15_456 production = new Production15_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}