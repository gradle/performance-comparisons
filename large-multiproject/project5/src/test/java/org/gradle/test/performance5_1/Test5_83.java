package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_83 {
    private final Production5_83 production = new Production5_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}