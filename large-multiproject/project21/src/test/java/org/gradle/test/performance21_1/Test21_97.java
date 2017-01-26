package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_97 {
    private final Production21_97 production = new Production21_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}