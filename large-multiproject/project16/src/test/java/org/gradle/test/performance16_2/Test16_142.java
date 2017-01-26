package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_142 {
    private final Production16_142 production = new Production16_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}