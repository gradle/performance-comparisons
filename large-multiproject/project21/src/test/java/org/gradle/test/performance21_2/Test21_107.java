package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_107 {
    private final Production21_107 production = new Production21_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}