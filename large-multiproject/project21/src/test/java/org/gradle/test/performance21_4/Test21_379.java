package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_379 {
    private final Production21_379 production = new Production21_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}