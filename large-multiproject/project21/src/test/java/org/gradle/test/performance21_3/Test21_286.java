package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_286 {
    private final Production21_286 production = new Production21_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}