package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_88 {
    private final Production21_88 production = new Production21_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}