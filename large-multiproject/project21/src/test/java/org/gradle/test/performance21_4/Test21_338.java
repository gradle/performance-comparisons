package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_338 {
    private final Production21_338 production = new Production21_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}