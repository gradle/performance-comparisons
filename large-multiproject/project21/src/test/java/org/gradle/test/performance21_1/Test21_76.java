package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_76 {
    private final Production21_76 production = new Production21_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}