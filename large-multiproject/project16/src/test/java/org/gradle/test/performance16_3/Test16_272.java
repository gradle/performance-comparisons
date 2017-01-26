package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_272 {
    private final Production16_272 production = new Production16_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}