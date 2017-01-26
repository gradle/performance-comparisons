package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_414 {
    private final Production71_414 production = new Production71_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}