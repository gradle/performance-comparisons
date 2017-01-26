package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_52 {
    private final Production16_52 production = new Production16_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}