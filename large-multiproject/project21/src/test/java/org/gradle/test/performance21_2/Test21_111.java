package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_111 {
    private final Production21_111 production = new Production21_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}