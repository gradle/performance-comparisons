package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_288 {
    private final Production21_288 production = new Production21_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}