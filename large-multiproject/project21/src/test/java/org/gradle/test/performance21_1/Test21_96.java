package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_96 {
    private final Production21_96 production = new Production21_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}