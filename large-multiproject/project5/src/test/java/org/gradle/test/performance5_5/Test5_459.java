package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_459 {
    private final Production5_459 production = new Production5_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}