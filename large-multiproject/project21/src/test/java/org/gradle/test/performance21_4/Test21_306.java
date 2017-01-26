package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_306 {
    private final Production21_306 production = new Production21_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}