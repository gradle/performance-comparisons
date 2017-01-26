package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_313 {
    private final Production16_313 production = new Production16_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}