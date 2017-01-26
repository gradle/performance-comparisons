package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_363 {
    private final Production5_363 production = new Production5_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}