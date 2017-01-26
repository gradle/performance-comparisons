package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_241 {
    private final Production21_241 production = new Production21_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}