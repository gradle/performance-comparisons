package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_361 {
    private final Production21_361 production = new Production21_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}