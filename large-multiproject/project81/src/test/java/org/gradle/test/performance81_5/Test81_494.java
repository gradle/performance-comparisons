package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_494 {
    private final Production81_494 production = new Production81_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}