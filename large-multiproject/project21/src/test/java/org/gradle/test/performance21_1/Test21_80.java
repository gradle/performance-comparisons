package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_80 {
    private final Production21_80 production = new Production21_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}