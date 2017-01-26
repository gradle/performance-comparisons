package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_204 {
    private final Production21_204 production = new Production21_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}