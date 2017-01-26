package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_267 {
    private final Production21_267 production = new Production21_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}