package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_216 {
    private final Production21_216 production = new Production21_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}