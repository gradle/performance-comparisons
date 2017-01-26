package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_100 {
    private final Production21_100 production = new Production21_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}