package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_55 {
    private final Production16_55 production = new Production16_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}