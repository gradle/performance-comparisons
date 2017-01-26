package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_131 {
    private final Production5_131 production = new Production5_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}