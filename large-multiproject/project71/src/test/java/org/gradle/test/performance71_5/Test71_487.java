package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_487 {
    private final Production71_487 production = new Production71_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}