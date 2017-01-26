package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_67 {
    private final Production21_67 production = new Production21_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}