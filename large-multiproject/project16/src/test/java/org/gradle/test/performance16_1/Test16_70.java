package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_70 {
    private final Production16_70 production = new Production16_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}