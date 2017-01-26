package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_295 {
    private final Production71_295 production = new Production71_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}