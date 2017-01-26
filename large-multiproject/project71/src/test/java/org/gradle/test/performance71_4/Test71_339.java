package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_339 {
    private final Production71_339 production = new Production71_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}