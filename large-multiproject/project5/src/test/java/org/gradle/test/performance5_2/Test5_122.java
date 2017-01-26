package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_122 {
    private final Production5_122 production = new Production5_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}