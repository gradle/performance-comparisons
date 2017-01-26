package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_123 {
    private final Production71_123 production = new Production71_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}