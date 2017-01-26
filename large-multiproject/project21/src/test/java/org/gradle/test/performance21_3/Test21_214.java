package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_214 {
    private final Production21_214 production = new Production21_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}