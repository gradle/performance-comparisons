package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_441 {
    private final Production16_441 production = new Production16_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}