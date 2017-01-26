package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_473 {
    private final Production16_473 production = new Production16_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}