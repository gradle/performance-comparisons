package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_247 {
    private final Production16_247 production = new Production16_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}