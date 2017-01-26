package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_143 {
    private final Production5_143 production = new Production5_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}