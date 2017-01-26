package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_259 {
    private final Production21_259 production = new Production21_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}