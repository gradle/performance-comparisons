package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_390 {
    private final Production21_390 production = new Production21_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}