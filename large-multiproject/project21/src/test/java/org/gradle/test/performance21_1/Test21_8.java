package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_8 {
    private final Production21_8 production = new Production21_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}