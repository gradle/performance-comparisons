package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_370 {
    private final Production5_370 production = new Production5_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}