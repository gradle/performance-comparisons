package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_190 {
    private final Production16_190 production = new Production16_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}