package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_78 {
    private final Production21_78 production = new Production21_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}