package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_465 {
    private final Production21_465 production = new Production21_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}