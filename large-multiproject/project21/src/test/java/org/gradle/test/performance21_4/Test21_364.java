package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_364 {
    private final Production21_364 production = new Production21_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}