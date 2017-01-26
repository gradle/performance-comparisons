package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_456 {
    private final Production85_456 production = new Production85_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}