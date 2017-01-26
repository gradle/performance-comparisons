package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_34 {
    private final Production5_34 production = new Production5_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}