package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_494 {
    private final Production65_494 production = new Production65_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}