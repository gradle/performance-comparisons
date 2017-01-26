package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_265 {
    private final Production5_265 production = new Production5_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}