package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_457 {
    private final Production21_457 production = new Production21_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}