package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_327 {
    private final Production71_327 production = new Production71_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}