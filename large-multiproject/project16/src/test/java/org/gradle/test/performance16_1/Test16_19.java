package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_19 {
    private final Production16_19 production = new Production16_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}