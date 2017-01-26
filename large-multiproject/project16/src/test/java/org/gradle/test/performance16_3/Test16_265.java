package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_265 {
    private final Production16_265 production = new Production16_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}