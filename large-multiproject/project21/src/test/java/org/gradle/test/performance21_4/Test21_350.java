package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_350 {
    private final Production21_350 production = new Production21_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}