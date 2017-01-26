package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_245 {
    private final Production71_245 production = new Production71_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}