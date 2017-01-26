package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_467 {
    private final Production16_467 production = new Production16_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}