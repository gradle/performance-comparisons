package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_171 {
    private final Production21_171 production = new Production21_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}