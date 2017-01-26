package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_292 {
    private final Production71_292 production = new Production71_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}