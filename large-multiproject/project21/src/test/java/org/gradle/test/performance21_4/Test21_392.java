package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_392 {
    private final Production21_392 production = new Production21_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}