package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_123 {
    private final Production85_123 production = new Production85_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}