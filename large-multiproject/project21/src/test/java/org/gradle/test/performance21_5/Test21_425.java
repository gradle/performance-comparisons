package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_425 {
    private final Production21_425 production = new Production21_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}