package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_348 {
    private final Production5_348 production = new Production5_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}