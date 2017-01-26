package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_427 {
    private final Production21_427 production = new Production21_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}