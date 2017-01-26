package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_462 {
    private final Production16_462 production = new Production16_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}