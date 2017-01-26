package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_183 {
    private final Production21_183 production = new Production21_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}