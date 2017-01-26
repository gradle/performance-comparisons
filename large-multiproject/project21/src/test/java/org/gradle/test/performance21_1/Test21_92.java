package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_92 {
    private final Production21_92 production = new Production21_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}