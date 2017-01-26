package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_20 {
    private final Production5_20 production = new Production5_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}