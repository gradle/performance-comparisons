package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_34 {
    private final Production21_34 production = new Production21_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}