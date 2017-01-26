package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_19 {
    private final Production5_19 production = new Production5_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}