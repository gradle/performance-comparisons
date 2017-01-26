package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_376 {
    private final Production71_376 production = new Production71_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}