package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_131 {
    private final Production16_131 production = new Production16_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}