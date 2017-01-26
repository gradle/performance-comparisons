package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_494 {
    private final Production95_494 production = new Production95_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}