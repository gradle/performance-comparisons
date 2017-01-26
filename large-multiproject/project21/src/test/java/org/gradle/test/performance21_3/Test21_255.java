package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_255 {
    private final Production21_255 production = new Production21_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}