package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_145 {
    private final Production21_145 production = new Production21_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}