package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_123 {
    private final Production65_123 production = new Production65_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}