package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_64 {
    private final Production16_64 production = new Production16_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}