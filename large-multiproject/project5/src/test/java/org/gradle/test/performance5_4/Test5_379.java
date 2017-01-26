package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_379 {
    private final Production5_379 production = new Production5_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}