package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_321 {
    private final Production5_321 production = new Production5_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}