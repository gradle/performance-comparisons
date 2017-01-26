package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_333 {
    private final Production5_333 production = new Production5_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}