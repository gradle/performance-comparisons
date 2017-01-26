package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_413 {
    private final Production5_413 production = new Production5_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}