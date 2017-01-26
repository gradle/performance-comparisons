package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_33 {
    private final Production5_33 production = new Production5_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}