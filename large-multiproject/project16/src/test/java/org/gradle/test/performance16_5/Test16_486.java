package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_486 {
    private final Production16_486 production = new Production16_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}