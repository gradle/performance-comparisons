package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_122 {
    private final Production16_122 production = new Production16_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}