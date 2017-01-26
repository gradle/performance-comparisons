package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_56 {
    private final Production16_56 production = new Production16_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}