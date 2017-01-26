package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_61 {
    private final Production21_61 production = new Production21_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}