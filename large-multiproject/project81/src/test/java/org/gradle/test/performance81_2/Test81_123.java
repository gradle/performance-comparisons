package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_123 {
    private final Production81_123 production = new Production81_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}