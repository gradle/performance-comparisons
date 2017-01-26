package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_166 {
    private final Production21_166 production = new Production21_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}