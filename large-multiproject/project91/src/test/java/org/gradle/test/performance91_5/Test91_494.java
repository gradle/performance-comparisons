package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_494 {
    private final Production91_494 production = new Production91_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}