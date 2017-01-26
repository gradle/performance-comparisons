package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_499 {
    private final Production5_499 production = new Production5_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}