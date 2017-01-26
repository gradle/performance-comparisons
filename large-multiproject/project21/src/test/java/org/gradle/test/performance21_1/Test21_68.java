package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_68 {
    private final Production21_68 production = new Production21_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}