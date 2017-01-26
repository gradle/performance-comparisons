package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_155 {
    private final Production21_155 production = new Production21_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}