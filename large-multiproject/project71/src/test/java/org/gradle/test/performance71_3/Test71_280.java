package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_280 {
    private final Production71_280 production = new Production71_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}