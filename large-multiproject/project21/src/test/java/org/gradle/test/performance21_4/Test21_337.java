package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_337 {
    private final Production21_337 production = new Production21_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}