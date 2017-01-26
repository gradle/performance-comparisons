package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_294 {
    private final Production21_294 production = new Production21_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}