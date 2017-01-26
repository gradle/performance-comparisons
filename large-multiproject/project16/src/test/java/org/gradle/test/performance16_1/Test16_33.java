package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_33 {
    private final Production16_33 production = new Production16_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}