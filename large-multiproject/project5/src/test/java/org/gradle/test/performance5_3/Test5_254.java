package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_254 {
    private final Production5_254 production = new Production5_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}