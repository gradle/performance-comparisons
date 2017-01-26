package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_472 {
    private final Production5_472 production = new Production5_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}