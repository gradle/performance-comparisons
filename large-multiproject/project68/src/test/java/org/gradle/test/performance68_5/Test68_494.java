package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_494 {
    private final Production68_494 production = new Production68_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}