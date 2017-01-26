package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_89 {
    private final Production21_89 production = new Production21_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}