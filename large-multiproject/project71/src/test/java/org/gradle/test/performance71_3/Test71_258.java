package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_258 {
    private final Production71_258 production = new Production71_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}