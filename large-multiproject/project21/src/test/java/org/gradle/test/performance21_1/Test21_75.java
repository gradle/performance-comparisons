package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_75 {
    private final Production21_75 production = new Production21_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}