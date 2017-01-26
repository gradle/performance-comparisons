package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_30 {
    private final Production5_30 production = new Production5_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}