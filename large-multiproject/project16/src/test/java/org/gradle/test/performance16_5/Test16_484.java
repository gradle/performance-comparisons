package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_484 {
    private final Production16_484 production = new Production16_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}