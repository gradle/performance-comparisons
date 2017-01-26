package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_260 {
    private final Production21_260 production = new Production21_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}