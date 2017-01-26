package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_221 {
    private final Production5_221 production = new Production5_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}