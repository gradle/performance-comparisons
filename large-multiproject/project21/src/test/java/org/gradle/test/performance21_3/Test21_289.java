package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_289 {
    private final Production21_289 production = new Production21_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}