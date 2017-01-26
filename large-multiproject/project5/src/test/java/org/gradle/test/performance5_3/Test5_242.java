package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_242 {
    private final Production5_242 production = new Production5_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}