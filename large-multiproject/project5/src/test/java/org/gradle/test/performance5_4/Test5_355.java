package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_355 {
    private final Production5_355 production = new Production5_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}