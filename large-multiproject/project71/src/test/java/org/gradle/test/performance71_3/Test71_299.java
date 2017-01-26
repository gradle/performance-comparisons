package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_299 {
    private final Production71_299 production = new Production71_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}