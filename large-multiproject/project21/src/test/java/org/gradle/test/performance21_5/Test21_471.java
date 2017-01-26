package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_471 {
    private final Production21_471 production = new Production21_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}