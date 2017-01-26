package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_142 {
    private final Production5_142 production = new Production5_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}