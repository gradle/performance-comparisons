package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_215 {
    private final Production21_215 production = new Production21_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}