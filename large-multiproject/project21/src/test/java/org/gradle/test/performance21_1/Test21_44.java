package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_44 {
    private final Production21_44 production = new Production21_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}