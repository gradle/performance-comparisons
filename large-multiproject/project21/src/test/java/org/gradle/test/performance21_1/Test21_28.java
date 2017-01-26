package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_28 {
    private final Production21_28 production = new Production21_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}