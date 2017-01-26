package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_495 {
    private final Production21_495 production = new Production21_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}