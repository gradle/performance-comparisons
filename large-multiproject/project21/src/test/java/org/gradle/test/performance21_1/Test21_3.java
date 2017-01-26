package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_3 {
    private final Production21_3 production = new Production21_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}