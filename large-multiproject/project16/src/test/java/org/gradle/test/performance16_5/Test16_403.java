package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_403 {
    private final Production16_403 production = new Production16_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}