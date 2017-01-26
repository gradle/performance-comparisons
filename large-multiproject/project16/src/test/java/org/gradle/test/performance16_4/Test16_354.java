package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_354 {
    private final Production16_354 production = new Production16_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}