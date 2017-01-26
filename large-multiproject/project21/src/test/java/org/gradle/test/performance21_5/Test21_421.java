package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_421 {
    private final Production21_421 production = new Production21_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}