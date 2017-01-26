package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_139 {
    private final Production16_139 production = new Production16_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}