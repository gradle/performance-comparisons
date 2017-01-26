package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_42 {
    private final Production21_42 production = new Production21_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}