package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_438 {
    private final Production5_438 production = new Production5_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}