package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_101 {
    private final Production71_101 production = new Production71_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}