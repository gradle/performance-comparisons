package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_210 {
    private final Production5_210 production = new Production5_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}