package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_157 {
    private final Production21_157 production = new Production21_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}