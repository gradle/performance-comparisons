package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_71 {
    private final Production21_71 production = new Production21_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}