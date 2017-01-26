package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_494 {
    private final Production71_494 production = new Production71_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}