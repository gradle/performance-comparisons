package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_486 {
    private final Production5_486 production = new Production5_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}