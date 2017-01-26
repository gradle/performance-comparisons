package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_226 {
    private final Production16_226 production = new Production16_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}