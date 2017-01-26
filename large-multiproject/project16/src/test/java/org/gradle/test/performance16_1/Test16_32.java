package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_32 {
    private final Production16_32 production = new Production16_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}