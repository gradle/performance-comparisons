package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_38 {
    private final Production21_38 production = new Production21_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}