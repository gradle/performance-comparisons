package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_55 {
    private final Production5_55 production = new Production5_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}