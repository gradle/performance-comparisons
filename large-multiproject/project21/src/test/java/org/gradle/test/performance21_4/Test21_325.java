package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_325 {
    private final Production21_325 production = new Production21_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}