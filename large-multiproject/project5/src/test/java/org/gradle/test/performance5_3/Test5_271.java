package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_271 {
    private final Production5_271 production = new Production5_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}