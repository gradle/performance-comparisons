package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_476 {
    private final Production5_476 production = new Production5_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}