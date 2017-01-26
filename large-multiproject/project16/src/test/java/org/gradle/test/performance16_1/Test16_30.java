package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_30 {
    private final Production16_30 production = new Production16_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}