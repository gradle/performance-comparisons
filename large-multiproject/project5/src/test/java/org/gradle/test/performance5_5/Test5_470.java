package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_470 {
    private final Production5_470 production = new Production5_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}