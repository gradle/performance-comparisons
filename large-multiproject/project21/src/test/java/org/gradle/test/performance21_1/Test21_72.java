package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_72 {
    private final Production21_72 production = new Production21_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}