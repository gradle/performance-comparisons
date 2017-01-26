package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_256 {
    private final Production71_256 production = new Production71_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}