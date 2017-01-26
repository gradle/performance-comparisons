package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_167 {
    private final Production21_167 production = new Production21_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}