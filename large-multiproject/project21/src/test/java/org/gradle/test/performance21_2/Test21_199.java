package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_199 {
    private final Production21_199 production = new Production21_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}