package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_178 {
    private final Production16_178 production = new Production16_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}