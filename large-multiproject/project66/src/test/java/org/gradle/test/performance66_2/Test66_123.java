package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_123 {
    private final Production66_123 production = new Production66_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}