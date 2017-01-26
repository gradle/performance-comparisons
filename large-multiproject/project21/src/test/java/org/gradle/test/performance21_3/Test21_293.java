package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_293 {
    private final Production21_293 production = new Production21_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}