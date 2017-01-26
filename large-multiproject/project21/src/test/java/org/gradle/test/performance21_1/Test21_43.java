package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_43 {
    private final Production21_43 production = new Production21_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}