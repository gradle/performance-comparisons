package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_164 {
    private final Production5_164 production = new Production5_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}