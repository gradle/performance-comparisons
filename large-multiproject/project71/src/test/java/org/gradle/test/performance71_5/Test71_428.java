package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_428 {
    private final Production71_428 production = new Production71_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}