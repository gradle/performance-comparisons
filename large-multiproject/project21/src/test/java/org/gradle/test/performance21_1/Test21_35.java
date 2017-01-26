package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_35 {
    private final Production21_35 production = new Production21_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}