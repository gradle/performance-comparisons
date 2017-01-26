package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_153 {
    private final Production71_153 production = new Production71_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}