package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_323 {
    private final Production21_323 production = new Production21_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}