package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_258 {
    private final Production5_258 production = new Production5_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}