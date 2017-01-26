package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_268 {
    private final Production21_268 production = new Production21_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}