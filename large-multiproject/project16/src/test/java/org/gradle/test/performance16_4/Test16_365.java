package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_365 {
    private final Production16_365 production = new Production16_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}