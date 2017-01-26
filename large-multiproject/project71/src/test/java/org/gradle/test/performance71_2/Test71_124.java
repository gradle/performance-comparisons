package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_124 {
    private final Production71_124 production = new Production71_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}