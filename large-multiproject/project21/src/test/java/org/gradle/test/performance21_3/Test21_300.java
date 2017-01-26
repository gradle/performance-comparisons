package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_300 {
    private final Production21_300 production = new Production21_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}