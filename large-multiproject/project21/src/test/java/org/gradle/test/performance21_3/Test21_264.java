package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_264 {
    private final Production21_264 production = new Production21_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}