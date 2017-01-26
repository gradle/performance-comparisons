package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_202 {
    private final Production21_202 production = new Production21_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}