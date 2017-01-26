package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_430 {
    private final Production71_430 production = new Production71_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}