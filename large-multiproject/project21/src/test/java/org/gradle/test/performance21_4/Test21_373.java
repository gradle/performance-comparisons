package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_373 {
    private final Production21_373 production = new Production21_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}