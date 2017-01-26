package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_482 {
    private final Production5_482 production = new Production5_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}