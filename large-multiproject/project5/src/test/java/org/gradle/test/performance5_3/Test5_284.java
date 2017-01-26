package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_284 {
    private final Production5_284 production = new Production5_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}