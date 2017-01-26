package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_93 {
    private final Production21_93 production = new Production21_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}