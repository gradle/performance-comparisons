package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_221 {
    private final Production16_221 production = new Production16_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}