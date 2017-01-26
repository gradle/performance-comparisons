package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_346 {
    private final Production71_346 production = new Production71_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}