package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_388 {
    private final Production21_388 production = new Production21_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}