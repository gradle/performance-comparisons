package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_147 {
    private final Production21_147 production = new Production21_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}