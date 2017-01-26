package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_208 {
    private final Production5_208 production = new Production5_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}