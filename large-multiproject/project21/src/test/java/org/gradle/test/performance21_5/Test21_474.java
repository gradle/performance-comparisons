package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_474 {
    private final Production21_474 production = new Production21_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}