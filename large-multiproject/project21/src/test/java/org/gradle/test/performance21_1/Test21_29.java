package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_29 {
    private final Production21_29 production = new Production21_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}