package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_123 {
    private final Production59_123 production = new Production59_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}