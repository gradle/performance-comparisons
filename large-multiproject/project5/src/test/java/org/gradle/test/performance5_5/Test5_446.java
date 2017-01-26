package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_446 {
    private final Production5_446 production = new Production5_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}