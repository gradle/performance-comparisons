package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_39 {
    private final Production21_39 production = new Production21_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}