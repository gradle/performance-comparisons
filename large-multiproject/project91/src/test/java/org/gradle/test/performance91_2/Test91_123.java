package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_123 {
    private final Production91_123 production = new Production91_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}