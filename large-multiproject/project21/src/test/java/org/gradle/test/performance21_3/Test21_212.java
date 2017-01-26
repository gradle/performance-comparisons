package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_212 {
    private final Production21_212 production = new Production21_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}