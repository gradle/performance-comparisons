package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_130 {
    private final Production71_130 production = new Production71_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}