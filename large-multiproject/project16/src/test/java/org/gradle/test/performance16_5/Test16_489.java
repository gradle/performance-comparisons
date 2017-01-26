package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_489 {
    private final Production16_489 production = new Production16_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}