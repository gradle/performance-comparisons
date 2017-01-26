package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_184 {
    private final Production71_184 production = new Production71_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}