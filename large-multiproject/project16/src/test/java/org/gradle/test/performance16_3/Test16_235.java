package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_235 {
    private final Production16_235 production = new Production16_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}