package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_14 {
    private final Production21_14 production = new Production21_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}