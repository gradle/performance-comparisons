package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_498 {
    private final Production21_498 production = new Production21_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}