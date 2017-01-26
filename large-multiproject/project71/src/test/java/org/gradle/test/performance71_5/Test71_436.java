package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_436 {
    private final Production71_436 production = new Production71_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}