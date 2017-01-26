package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_186 {
    private final Production21_186 production = new Production21_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}