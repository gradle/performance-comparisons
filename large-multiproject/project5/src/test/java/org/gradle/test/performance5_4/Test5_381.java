package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_381 {
    private final Production5_381 production = new Production5_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}