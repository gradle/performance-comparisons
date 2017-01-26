package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_483 {
    private final Production5_483 production = new Production5_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}