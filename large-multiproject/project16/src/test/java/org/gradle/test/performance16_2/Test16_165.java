package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_165 {
    private final Production16_165 production = new Production16_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}