package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_494 {
    private final Production51_494 production = new Production51_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}