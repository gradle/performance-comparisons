package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_230 {
    private final Production21_230 production = new Production21_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}