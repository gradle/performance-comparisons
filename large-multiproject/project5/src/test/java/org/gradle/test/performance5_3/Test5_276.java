package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_276 {
    private final Production5_276 production = new Production5_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}