package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_494 {
    private final Production33_494 production = new Production33_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}