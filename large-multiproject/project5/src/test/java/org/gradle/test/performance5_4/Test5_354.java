package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_354 {
    private final Production5_354 production = new Production5_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}