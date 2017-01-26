package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_340 {
    private final Production5_340 production = new Production5_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}