package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_278 {
    private final Production16_278 production = new Production16_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}