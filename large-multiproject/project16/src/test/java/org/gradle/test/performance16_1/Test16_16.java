package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_16 {
    private final Production16_16 production = new Production16_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}