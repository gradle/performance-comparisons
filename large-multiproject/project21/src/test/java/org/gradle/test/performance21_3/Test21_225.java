package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_225 {
    private final Production21_225 production = new Production21_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}