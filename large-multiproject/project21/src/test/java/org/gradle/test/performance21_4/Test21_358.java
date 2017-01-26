package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_358 {
    private final Production21_358 production = new Production21_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}