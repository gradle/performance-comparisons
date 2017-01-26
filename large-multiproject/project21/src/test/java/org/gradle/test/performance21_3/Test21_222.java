package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_222 {
    private final Production21_222 production = new Production21_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}