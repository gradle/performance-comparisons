package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_171 {
    private final Production5_171 production = new Production5_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}