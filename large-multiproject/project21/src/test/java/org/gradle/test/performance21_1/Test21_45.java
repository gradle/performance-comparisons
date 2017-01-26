package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_45 {
    private final Production21_45 production = new Production21_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}