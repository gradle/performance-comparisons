package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_105 {
    private final Production16_105 production = new Production16_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}