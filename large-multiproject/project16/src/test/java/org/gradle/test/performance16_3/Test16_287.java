package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_287 {
    private final Production16_287 production = new Production16_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}