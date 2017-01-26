package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_123 {
    private final Production33_123 production = new Production33_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}