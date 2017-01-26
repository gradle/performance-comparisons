package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_105 {
    private final Production5_105 production = new Production5_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}