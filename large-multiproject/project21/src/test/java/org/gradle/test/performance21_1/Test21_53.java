package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_53 {
    private final Production21_53 production = new Production21_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}