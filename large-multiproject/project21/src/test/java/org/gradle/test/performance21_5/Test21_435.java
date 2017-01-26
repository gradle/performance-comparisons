package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_435 {
    private final Production21_435 production = new Production21_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}