package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_270 {
    private final Production21_270 production = new Production21_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}