package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_436 {
    private final Production5_436 production = new Production5_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}