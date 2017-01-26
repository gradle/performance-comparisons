package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_58 {
    private final Production21_58 production = new Production21_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}