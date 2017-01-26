package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_420 {
    private final Production16_420 production = new Production16_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}