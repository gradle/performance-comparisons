package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_307 {
    private final Production21_307 production = new Production21_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}