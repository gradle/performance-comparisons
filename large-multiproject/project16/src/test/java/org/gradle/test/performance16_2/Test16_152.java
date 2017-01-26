package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_152 {
    private final Production16_152 production = new Production16_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}