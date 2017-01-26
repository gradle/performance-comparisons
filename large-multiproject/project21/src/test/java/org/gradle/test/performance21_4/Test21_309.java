package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_309 {
    private final Production21_309 production = new Production21_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}