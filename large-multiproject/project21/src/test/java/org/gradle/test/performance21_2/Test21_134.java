package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_134 {
    private final Production21_134 production = new Production21_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}