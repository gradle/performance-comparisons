package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_113 {
    private final Production16_113 production = new Production16_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}