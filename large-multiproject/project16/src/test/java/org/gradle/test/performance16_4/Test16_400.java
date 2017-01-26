package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_400 {
    private final Production16_400 production = new Production16_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}