package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_420 {
    private final Production5_420 production = new Production5_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}