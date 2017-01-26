package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_102 {
    private final Production21_102 production = new Production21_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}