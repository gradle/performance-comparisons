package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_201 {
    private final Production71_201 production = new Production71_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}