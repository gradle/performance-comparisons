package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_448 {
    private final Production71_448 production = new Production71_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}