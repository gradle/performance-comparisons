package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_98 {
    private final Production21_98 production = new Production21_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}