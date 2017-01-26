package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_452 {
    private final Production16_452 production = new Production16_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}