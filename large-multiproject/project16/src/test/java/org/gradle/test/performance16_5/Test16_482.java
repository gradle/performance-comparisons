package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_482 {
    private final Production16_482 production = new Production16_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}