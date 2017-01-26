package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_315 {
    private final Production21_315 production = new Production21_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}