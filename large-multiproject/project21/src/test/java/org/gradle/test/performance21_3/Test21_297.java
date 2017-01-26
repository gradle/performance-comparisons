package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_297 {
    private final Production21_297 production = new Production21_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}