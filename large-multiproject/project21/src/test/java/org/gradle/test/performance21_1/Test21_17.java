package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_17 {
    private final Production21_17 production = new Production21_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}