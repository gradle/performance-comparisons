package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_200 {
    private final Production21_200 production = new Production21_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}