package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_201 {
    private final Production16_201 production = new Production16_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}