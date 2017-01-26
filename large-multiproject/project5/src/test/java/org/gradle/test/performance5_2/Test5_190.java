package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_190 {
    private final Production5_190 production = new Production5_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}