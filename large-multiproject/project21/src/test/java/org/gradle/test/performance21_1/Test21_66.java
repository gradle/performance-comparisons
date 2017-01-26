package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_66 {
    private final Production21_66 production = new Production21_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}