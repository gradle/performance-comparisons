package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_257 {
    private final Production21_257 production = new Production21_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}