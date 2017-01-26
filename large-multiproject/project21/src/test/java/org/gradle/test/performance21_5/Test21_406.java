package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_406 {
    private final Production21_406 production = new Production21_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}