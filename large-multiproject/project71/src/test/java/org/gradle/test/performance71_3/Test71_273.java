package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_273 {
    private final Production71_273 production = new Production71_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}