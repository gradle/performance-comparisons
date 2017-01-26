package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_62 {
    private final Production21_62 production = new Production21_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}