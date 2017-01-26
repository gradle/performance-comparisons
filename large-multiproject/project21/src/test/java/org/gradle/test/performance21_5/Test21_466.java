package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_466 {
    private final Production21_466 production = new Production21_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}