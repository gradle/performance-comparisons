package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_206 {
    private final Production5_206 production = new Production5_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}