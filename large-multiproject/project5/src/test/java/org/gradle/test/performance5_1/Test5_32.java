package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_32 {
    private final Production5_32 production = new Production5_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}