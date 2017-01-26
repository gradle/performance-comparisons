package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_344 {
    private final Production71_344 production = new Production71_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}