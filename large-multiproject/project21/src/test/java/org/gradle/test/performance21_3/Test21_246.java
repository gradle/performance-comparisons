package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_246 {
    private final Production21_246 production = new Production21_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}