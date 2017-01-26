package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_494 {
    private final Production29_494 production = new Production29_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}