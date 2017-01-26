package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_91 {
    private final Production21_91 production = new Production21_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}