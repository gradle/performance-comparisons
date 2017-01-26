package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_365 {
    private final Production5_365 production = new Production5_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}