package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_347 {
    private final Production21_347 production = new Production21_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}