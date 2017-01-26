package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_456 {
    private final Production90_456 production = new Production90_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}