package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_489 {
    private final Production5_489 production = new Production5_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}