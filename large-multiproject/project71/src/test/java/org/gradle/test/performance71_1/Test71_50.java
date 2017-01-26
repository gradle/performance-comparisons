package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_50 {
    private final Production71_50 production = new Production71_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}