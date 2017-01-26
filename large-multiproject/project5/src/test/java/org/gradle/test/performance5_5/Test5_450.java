package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_450 {
    private final Production5_450 production = new Production5_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}