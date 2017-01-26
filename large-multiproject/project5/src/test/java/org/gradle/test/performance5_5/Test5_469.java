package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_469 {
    private final Production5_469 production = new Production5_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}