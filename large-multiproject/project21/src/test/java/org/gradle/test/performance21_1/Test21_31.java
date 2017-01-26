package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_31 {
    private final Production21_31 production = new Production21_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}