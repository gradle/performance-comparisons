package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_18 {
    private final Production5_18 production = new Production5_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}