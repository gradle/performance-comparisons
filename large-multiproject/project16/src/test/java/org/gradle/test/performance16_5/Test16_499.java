package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_499 {
    private final Production16_499 production = new Production16_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}