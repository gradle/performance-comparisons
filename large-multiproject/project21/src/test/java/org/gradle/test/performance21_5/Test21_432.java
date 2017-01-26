package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_432 {
    private final Production21_432 production = new Production21_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}