package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_330 {
    private final Production21_330 production = new Production21_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}