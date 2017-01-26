package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_188 {
    private final Production21_188 production = new Production21_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}