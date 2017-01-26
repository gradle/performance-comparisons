package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_494 {
    private final Production17_494 production = new Production17_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}