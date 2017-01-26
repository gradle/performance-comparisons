package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_318 {
    private final Production16_318 production = new Production16_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}