package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_478 {
    private final Production71_478 production = new Production71_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}