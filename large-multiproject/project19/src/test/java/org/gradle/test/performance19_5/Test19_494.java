package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_494 {
    private final Production19_494 production = new Production19_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}