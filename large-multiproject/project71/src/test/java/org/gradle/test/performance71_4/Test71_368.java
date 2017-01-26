package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_368 {
    private final Production71_368 production = new Production71_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}