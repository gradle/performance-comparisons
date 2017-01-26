package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_229 {
    private final Production21_229 production = new Production21_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}