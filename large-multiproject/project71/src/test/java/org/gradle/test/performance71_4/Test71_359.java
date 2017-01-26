package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_359 {
    private final Production71_359 production = new Production71_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}