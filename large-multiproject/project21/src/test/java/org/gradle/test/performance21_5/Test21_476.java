package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_476 {
    private final Production21_476 production = new Production21_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}