package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_372 {
    private final Production16_372 production = new Production16_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}