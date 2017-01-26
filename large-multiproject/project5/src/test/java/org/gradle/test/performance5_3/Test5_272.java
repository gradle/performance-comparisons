package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_272 {
    private final Production5_272 production = new Production5_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}