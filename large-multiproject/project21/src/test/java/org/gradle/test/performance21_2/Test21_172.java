package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_172 {
    private final Production21_172 production = new Production21_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}