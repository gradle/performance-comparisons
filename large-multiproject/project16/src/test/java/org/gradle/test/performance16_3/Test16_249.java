package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_249 {
    private final Production16_249 production = new Production16_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}