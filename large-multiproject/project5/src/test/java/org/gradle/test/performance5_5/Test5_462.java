package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_462 {
    private final Production5_462 production = new Production5_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}